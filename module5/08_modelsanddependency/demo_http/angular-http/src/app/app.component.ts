import { Component } from '@angular/core';
import {Subscription} from 'rxjs';
import {Employee} from './models/employee';
import {EmployeeService} from './services/employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-http';
  private subscription: Subscription;
  public employees: Employee[] = [];
  constructor(private _employeeService : EmployeeService) {
  }

  // tslint:disable-next-line:use-lifecycle-interface
  ngOnInit() {
    this.getAllEmployee();
  }
  getAllEmployee() {
    this.subscription = this._employeeService.getAllEmployee().subscribe(data => {
      this.employees = data;
    }, error => {
      console.log(error);
    });
  }
}
