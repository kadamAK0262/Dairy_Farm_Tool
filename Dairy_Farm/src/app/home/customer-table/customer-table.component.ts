import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { CustomerService } from 'src/app/services/customer.service';
import { CustomerComponent } from '../customer/customer.component';
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

  constructor(private customerService: CustomerService,private MatDialog:MatDialog) {}

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
  customerList:any;
  
  ngOnInit() {
    sessionStorage.getItem("society_id")
    // Fetch customer data when the component initializes
    this.customerService.getcustomerbyid(sessionStorage.getItem("society_id")).subscribe(response=>{
     this.customerList=response;
     console.log("customer list is ",this.customerList);
     
    })
  }

  addCustomer(){
      this.MatDialog.open(CustomerComponent)
      width: '100%'
  }

}
