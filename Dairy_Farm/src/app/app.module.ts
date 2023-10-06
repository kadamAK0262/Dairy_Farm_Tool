import { MatDialog } from '@angular/material/dialog';
import { MatCardModule } from '@angular/material/card';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatSelectModule } from '@angular/material/select';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './landing/header/header.component';
import { MainComponent } from './landing/main/main.component';


import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { AboutComponent } from './landing/about/about.component';
import { FooterComponent } from './landing/footer/footer.component';
import { ContentComponent } from './landing/content/content.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';

import { ErrorStateMatcher } from '@angular/material/core';
import { IndexComponent } from './landing/index/index.component';
import { DashboardComponent } from './home/dashboard/dashboard.component';
import { SideNavComponent } from './home/side-nav/side-nav.component';
import { ToolbarComponent } from './home/toolbar/toolbar.component';

import { DailyReportsComponent } from './home/daily-reports/daily-reports.component';
import { DailySalesComponent } from './home/daily-sales/daily-sales.component';
import { MatPaginator } from '@angular/material/paginator';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatTableModule } from '@angular/material/table';

import {MatDialogModule} from '@angular/material/dialog';
import {MatDividerModule} from '@angular/material/divider';
import { DailySalesPopupComponent } from './home/daily-sales-popup/daily-sales-popup.component';


import { NgIf } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { CustomerComponent } from './home/customer/customer.component';
import { CustomerTableComponent } from './home/customer-table/customer-table.component';




import { NgApexchartsModule } from 'ng-apexcharts';
import { SocietyComponent } from './home/distribution/society/society.component';
import { DailyCustomersComponent } from './home/distribution/daily-customers/daily-customers.component';
import { SocietyformComponent } from './home/distribution/societyform/societyform.component';
import { ReportdashboardComponent } from './home/report/reportdashboard/reportdashboard.component';
import { AnalysisReportComponent } from './home/report/analysis-report/analysis-report.component';
import { SalesreportComponent } from './home/report/salesreport/salesreport.component';
import { CustomerdetailsComponent } from './home/report/customerdetails/customerdetails.component';
import { PurchasereportsComponent } from './home/report/purchasereports/purchasereports.component';

import { UpdatecustomerPopupComponent } from './home/distribution/updatecustomer-popup/updatecustomer-popup.component';
import { DeletecustomerPopupComponent } from './home/distribution/deletecustomer-popup/deletecustomer-popup.component';
import { UpdateSocietyPopupComponent } from './home/distribution/update-society-popup/update-society-popup.component';
import { DeleteSocietyPopupComponent } from './home/distribution/delete-society-popup/delete-society-popup.component';




@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MainComponent,
    AboutComponent,
    FooterComponent,
    ContentComponent,
    LoginComponent,
    SignupComponent,
    IndexComponent,
    DashboardComponent,
    SideNavComponent,
    ToolbarComponent,
 
    DailyReportsComponent,
    DailySalesComponent,
    
    DailySalesPopupComponent,
    CustomerComponent,
    CustomerTableComponent,
    
    SocietyComponent,
    DailyCustomersComponent,
    SocietyformComponent,
    ReportdashboardComponent,
    AnalysisReportComponent,
    SalesreportComponent,
    CustomerdetailsComponent,
    PurchasereportsComponent,
 
    UpdatecustomerPopupComponent,
    DeletecustomerPopupComponent,
    UpdateSocietyPopupComponent,
    DeleteSocietyPopupComponent,
    
    
    
    
    
  ],
  imports: [
   
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatIconModule,
    MatFormFieldModule, 
    MatInputModule,
    MatSelectModule,
    ReactiveFormsModule,
    MatButtonModule,
    MatSnackBarModule,
    FormsModule,
    MatCardModule,
    MatFormFieldModule, MatInputModule, MatButtonModule, MatIconModule,
    MatPaginatorModule,MatTableModule,MatDialogModule,MatDividerModule,
    NgIf,HttpClientModule, NgApexchartsModule,

    
    
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
