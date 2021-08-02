import { Component, OnInit } from '@angular/core';
import {CustomerType} from "../../../models/customer-type";
import {Customer} from "../../../models/customer";
import {FormControl, FormGroup} from "@angular/forms";
import {Employee} from "../../../models/employee";
import {Education} from "../../../models/education";
import {Position} from "../../../models/position";
import {Division} from "../../../models/division";
import {EmployeeService} from "../../../services/employee.service";
import {EducationService} from "../../../services/education.service";
import {PositionService} from "../../../services/position.service";
import {DivisionService} from "../../../services/division.service";

@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent implements OnInit {
  educations: Education[];
  positions: Position[];
  divisions: Division[];
  employeeObj: Employee;
  employeeForm: FormGroup = new FormGroup({
    id: new FormControl(),
    education: new FormControl(),
    position: new FormControl(),
    division: new FormControl(),
    hoTen: new FormControl(),
    ngaySinh: new FormControl(),
    soCMND: new FormControl(),
    luong: new FormControl(),
    sdt: new FormControl(),
    email: new FormControl(),
    diaChi: new FormControl(),
  });
  constructor(private employeeService: EmployeeService , private educationService: EducationService,
              private positionService: PositionService, private divisionService: DivisionService) { }

  ngOnInit(): void {
    this.getAllEducation();
    this.getAllPosition();
    this.getAllDivision();
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
  submit() {
    this.employeeObj = this.employeeForm.value;
    console.log(this.employeeObj);
    this.employeeService.saveEmployee(this.employeeObj).subscribe();
  }

}
