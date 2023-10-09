import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError, map, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  private customerUrl = 'http://localhost:8081/api/addCostumer';
  // private getCustomerurl = 'http://localhost:8081/api/getCostumer';

  constructor(private http: HttpClient) {}

  customer(userData: any): Observable<any> {
    return this.http.post(this.customerUrl, userData).pipe(
      map((response: any) => {
        // Assuming the response contains user data
        return response;
      }),
      catchError(this.handleError)
    );
  }

  // getCustomers(): Observable<any[]> {
  //   return this.http.get<any[]>(this.getCustomerurl);
  // }

   //get customer daily data by society id
   getDailycustomerbyid(societyId:any){
    return this.http.get(`http://localhost:8081/dailyCustomers/societyId/${societyId}`)

   }

   getAllCustomerData(){
    return this.http.get(`http://localhost:8081/api/getCostumer`)
   }


   deleteCustomerById(id:any){
    return this.http.delete(`http://localhost:8081/api/deleteCustomer/${id}`)
   }

  private handleError(error: HttpErrorResponse): Observable<never> {
    let errorMessage = 'An error occurred';
    if (error.error instanceof ErrorEvent) {
      // Client-side error
      errorMessage = `Error: ${error.error.message}`;
    } else {
      // Server-side error
      errorMessage = `Error Code: ${error.status}, Message: ${error.message}`;
    }
    console.error(errorMessage);
    return throwError(errorMessage);
  }

}
