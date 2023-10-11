import { Component, ViewChild } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { CustomerService } from 'src/app/services/customer.service';
import { CustomerComponent } from '../customer/customer.component';
import { MatTable, MatTableDataSource } from '@angular/material/table';
export class Customer{
  address:any;
  bill:any;
  checkDate:any;
  contactNo:any;
  customerName:any;
  delivered:any;
  emailId:any;
  idOfSociety:any;
  milkType:any;
  outStandingBill:any;
  quantity:any;
  rate:any;
  action:any
}
@Component({
  selector: 'app-customer-table',
  templateUrl: './customer-table.component.html',
  styleUrls: ['./customer-table.component.css']
})
export class CustomerTableComponent  {

  customers: any[] = [];

  constructor(private customerService: CustomerService,private matDialog: MatDialog) {}

  displayedColumns: string[] = [
    'id',
    'address',
     'bill',
     'checkDate',
     'contactNo',
  'customerName',
  'delivered',
  'emailId',
  'idOfSociety',
  'milkType',
      'outStandingBill',
   'quantity',
  'rate',
  'action'
  ];
  dataSource = new MatTableDataSource<any>([]);
  @ViewChild(MatTable, { static: true })
  table!: MatTable<any>;

 
  
  ngOnInit() {
    this.getDailyCustomerData();
    this.saveDataToBackend();
   
  }
  customerList:any;
getDailyCustomerData(){
  sessionStorage.getItem("society_id")
  // Fetch customer data when the component initializes
  this.customerService.getDailycustomerbyid(sessionStorage.getItem("society_id")).subscribe(response =>{
   this.customerList=response;
   console.log("customer list is ",this.customerList);
   
  },
  (error) => {
    console.error("Error fetching customer data:", error);
  }
)
}

updatedCustomerList:any;
addToCustomerList(rowData: any) {
  // Add the selected row data to the customerList
  if (!this.updatedCustomerList) {
    this.updatedCustomerList = [];
  }

  this.updatedCustomerList.push(rowData);
  console.log("data added to list which we created in ts ",rowData)
}

    saveDataToBackend() {
      const dataListToSend = this.dataSource.data;
      console.log("data list to send in back end",this.customerList);
      for(const dataEntry of this.updatedCustomerList){
        this.customerService.saveDataList(dataEntry).subscribe(data=>{
          console.log(`Data entry ${dataEntry.id} updated successfully:`, data);
      
      })
    }
    
  }


  editCustomer(rowData: any) {
    // Open the edit dialog and pass the rowData to it
    const dialogRef = this.matDialog.open(EditCustomerDialogComponent, {
      data: { customerData: rowData },
    });

    dialogRef.afterClosed().subscribe((updatedData) => {
      if (updatedData) {
        // Update the MatTable and the list with the edited data
        const index = this.customerList.findIndex((item) => item.id === rowData.id);
        if (index !== -1) {
          this.customerList[index] = updatedData;
          this.table.renderRows();
        }
      }
    });
  }
}


