import {Component, Inject, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {EmployeeService} from "../../../services/employee.service";
import {EducationService} from "../../../services/education.service";
import {PositionService} from "../../../services/position.service";
import {DivisionService} from "../../../services/division.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-emloyee-detail',
  templateUrl: './emloyee-detail.component.html',
  styleUrls: ['./emloyee-detail.component.css']
})
export class EmloyeeDetailComponent implements OnInit {
  employeeForm = new FormGroup({
    id: new FormControl(this.data.id),
    education: new FormControl(this.data.education.name),
    position: new FormControl(this.data.position.name),
    division: new FormControl(this.data.division.name),
    hoTen: new FormControl(this.data.hoTen),
    ngaySinh: new FormControl(this.data.ngaySinh),
    soCMND: new FormControl(this.data.soCMND),
    luong: new FormControl(this.data.luong),
    sdt: new FormControl(this.data.sdt),
    email: new FormControl(this.data.email),
    diaChi: new FormControl(this.data.diaChi)
  });

  // tslint:disable-next-line:max-line-length
  constructor(private employeeService: EmployeeService , private educationService: EducationService, private positionService: PositionService, private divisionService: DivisionService, public dialogRef: MatDialogRef<EmloyeeDetailComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
  }

}
