

import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MainComponent } from './landing/main/main.component';
import { LoginComponent } from './login/login.component';
import { IndexComponent } from './landing/index/index.component';
import { SignupComponent } from './signup/signup.component';

import { DailySalesComponent } from './home/daily-sales/daily-sales.component';
import { DashboardComponent } from './home/dashboard/dashboard.component';
import { ToolbarComponent } from './home/toolbar/toolbar.component';
import { CustomerTableComponent } from './home/customer-table/customer-table.component';
import { CustomerComponent } from './home/customer/customer.component';


const routes: Routes = [
  
  {
    path :'', component : IndexComponent
  },
  {
    path :'main', component:MainComponent
  },
  {
    path : 'login', component : LoginComponent
  },
  {
    path : 'signup', component : SignupComponent 
  },
  
  {
    path : 'daily-sales', component : CustomerComponent
  },

  // {
  //   path : 'signup', component :SignupComponent
  // },
  
  // {
  //   path:'index', component : IndexComponent
  // },
  // { path: '', redirectTo: '/index', pathMatch: 'full' }

  {
    path: 'index', component : IndexComponent

  },
  {
    path : 'dashboard', component : DashboardComponent
  },
  {
    path : 'customer-table', component : CustomerTableComponent
  },
  
  // {
  //   path : 'dashboard', children:[
  //     {
         
  //     }
  //   ]
  // }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
