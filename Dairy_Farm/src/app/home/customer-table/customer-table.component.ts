import { Component } from '@angular/core';
import { CustomerService } from 'src/app/services/customer.service';
export interface Customer{
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
}
@Component({
  selector: 'app-customer-table',
  templateUrl: './customer-table.component.html',
  styleUrls: ['./customer-table.component.css']
})
export class CustomerTableComponent {

  customers: any[] = [];

  constructor(private customerService: CustomerService) {}

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
  'rate'
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

}
