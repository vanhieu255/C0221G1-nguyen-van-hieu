import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {CustomerListComponent} from './components/customer/customer-list/customer-list.component';
import {CustomerAddComponent} from './components/customer/customer-add/customer-add.component';
import {CustomerEditComponent} from './components/customer/customer-edit/customer-edit.component';
import {CustomerTypeComponent} from './components/customerType/customer-type/customer-type.component';
import {EmployeeListComponent} from "./components/employee/employee-list/employee-list.component";
import {EmployeeAddComponent} from "./components/employee/employee-add/employee-add.component";


const routes: Routes = [{
  path: '',
  pathMatch: 'full',
  redirectTo: 'customer/list'
},
  {
    path: 'customer/list',
    component: CustomerListComponent
  },
  {
    path: 'customer/create',
    component: CustomerAddComponent
  },
  {
    path: 'customer/edit',
    component: CustomerEditComponent
  },
  {
    path: 'customerType/list',
    component: CustomerTypeComponent
  },
  {
    path: 'employee/list',
    component: EmployeeListComponent
  },
  {
    path: 'employee/create',
    component: EmployeeAddComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
