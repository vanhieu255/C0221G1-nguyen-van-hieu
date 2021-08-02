import { Component, OnInit } from '@angular/core';

import {Employee} from '../../../models/employee';
import {EmployeeService} from "../../../services/employee.service";
import {EducationService} from "../../../services/education.service";
import {PositionService} from "../../../services/position.service";
import {DivisionService} from "../../../services/division.service";
import {MatDialog} from "@angular/material/dialog";
import {Education} from "../../../models/education";
import {Division} from '../../../models/division';
import {Position} from '../../../models/position';


import {EmployeeEditComponent} from "../employee-edit/employee-edit.component";
import {EmployeeDeleteComponent} from "../employee-delete/employee-delete.component";
import {EmloyeeDetailComponent} from "../emloyee-detail/emloyee-detail.component";

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[] = [];
  educations: Education[];
  positions: Position[];
  divisions: Division[];
  searchText: any;
  config: any;
  constructor( private employeeService: EmployeeService , private educationService: EducationService,
               private positionService: PositionService, private divisionService: DivisionService, public dialog: MatDialog ) {
    this.config = {
      itemsPerPage: 2,
      currentPage: 1,
      totalItems: this.employees.length
    };
  }

  ngOnInit(): void {
    this.getAll();
    this.getAllEducation();
    this.getAllPosition();
    this.getAllDivision();
  }
  getAll() {
    this.employeeService.getAll().subscribe(next => {
      this.employees = next;
    });
  }
  getAllEducation() {
    this.educationService.getAll().subscribe(next => {
      this.educations = next;
    });
  }
  getAllPosition() {
    this.positionService.getAll().subscribe(next => {
      this.positions = next;
    });
  }
  getAllDivision() {
    this.divisionService.getAll().subscribe(next => {
      this.divisions = next;
    });
  }
  pageChanged(event) {
    console.log(event);
    this.config.currentPage = event;
  }
  search() {
    this.employeeService.search(this.searchText).subscribe(next => {
      this.employees = next;
    });
  }

  onEditHandler(employee: Employee) {
    const dialogRef = this.dialog.open(EmployeeEditComponent, {
      width: '500px',
      data: employee
    });

    dialogRef.afterClosed().subscribe(result => {
      this.getAll();
    });

  }

  onDeleteHandler(id: number) {
    const dialogRef = this.dialog.open( EmployeeDeleteComponent, {
      width: '250px',
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      console.log(result);
      if (result) {
        this.employeeService.deleteEmployee(id).subscribe(next => {
          this.getAll();
        });
      }
    });


  }

  onDetailHandler(employee: Employee) {
    const dialogRef = this.dialog.open(EmloyeeDetailComponent, {
      width: '500px',
      data: employee
    });
  }

}
