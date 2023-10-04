import { CustomerService } from './../../services/customer.service';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent {

  customerForm: FormGroup;
  submitted = false;
  success = false;

  constructor(private formBuilder: FormBuilder, private customerService : CustomerService, private router : Router) {
    this.customerForm = this.formBuilder.group({
      costumerName: ['', Validators.required],
      contactNo: ['', [Validators.required, Validators.pattern(/^\d{10}$/)]],
      emailId: ['', [Validators.email]],
      address: [''],
      milkType: [''],
      quantity: ['', Validators.required]
    });
  }

  onSubmit() {
    this.submitted = true;

    if (this.customerForm.invalid) {
      // return;
    }

    // Submit the form data to your service
    this.customerService.customer(this.customerForm.value)
      .subscribe(
        response => {
          this.success = true;
          console.log('Form submitted successfully. Response:', response);
          this.router.navigate(['/customer-table']);
        },
        error => {
          console.error('Form submission error:', error);
        }
      );
  }


}
