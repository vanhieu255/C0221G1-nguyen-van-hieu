import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerListComponent } from './components/customer/customer-list/customer-list.component';
import { CustomerAddComponent } from './components/customer/customer-add/customer-add.component';
import { CustomerEditComponent } from './components/customer/customer-edit/customer-edit.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {NgxPaginationModule} from "ngx-pagination";
import { CustomerTypeComponent } from './components/customerType/customer-type/customer-type.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatDialogModule} from "@angular/material/dialog";
import {HttpClientModule} from "@angular/common/http";
import { CustomerDeleteComponent } from './components/customer/customer-delete/customer-delete.component';
import { CustomerDetailComponent } from './components/customer/customer-detail/customer-detail.component';
import { EmployeeListComponent } from './components/employee/employee-list/employee-list.component';
import { EmployeeAddComponent } from './components/employee/employee-add/employee-add.component';
import { EmployeeEditComponent } from './components/employee/employee-edit/employee-edit.component';
import { EmployeeDeleteComponent } from './components/employee/employee-delete/employee-delete.component';
import { EmloyeeDetailComponent } from './components/employee/emloyee-detail/emloyee-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    CustomerListComponent,
    CustomerAddComponent,
    CustomerEditComponent,
    CustomerTypeComponent,
    CustomerDeleteComponent,
    CustomerDetailComponent,
    EmployeeListComponent,
    EmployeeAddComponent,
    EmployeeEditComponent,
    EmployeeDeleteComponent,
    EmloyeeDetailComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        ReactiveFormsModule,
        NgxPaginationModule,
        Ng2SearchPipeModule,
        BrowserAnimationsModule,
        MatDialogModule,
        HttpClientModule

    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
