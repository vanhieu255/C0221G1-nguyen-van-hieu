import {Component, Inject, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {Education} from "../../../models/education";
import {Position} from "../../../models/position";
import {Division} from "../../../models/division";
import {Employee} from "../../../models/employee";
import {EmployeeService} from "../../../services/employee.service";
import {EducationService} from "../../../services/education.service";
import {PositionService} from "../../../services/position.service";
import {DivisionService} from "../../../services/division.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {
  employeeForm: FormGroup;
  educations: Education[];
  positions: Position[];
  divisions: Division[];
  id: number;
  employee: Employee;


  // tslint:disable-next-line:max-line-length
  constructor(private employeeService: EmployeeService , private educationService: EducationService, private positionService: PositionService, private divisionService: DivisionService, public dialogRef: MatDialogRef<EmployeeEditComponent>,
  @Inject(MAT_DIALOG_DATA) public data: any) {
    this.employeeForm = new FormGroup({
      id: new FormControl(this.data.id),
      education: new FormControl(this.data.education),
      position: new FormControl(this.data.position),
      division: new FormControl(this.data.division),
      hoTen: new FormControl(this.data.hoTen),
      ngaySinh: new FormControl(this.data.ngaySinh),
      soCMND: new FormControl(this.data.soCMND),
      luong: new FormControl(this.data.luong),
      sdt: new FormControl(this.data.sdt),
      email: new FormControl(this.data.email),
      diaChi: new FormControl(this.data.diaChi)
    });
  }

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
  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }
  updateEmployee() {
    this.employee = this.employeeForm.value;
    this.employeeService.updateEmployee(this.employee.id, this.employee).subscribe();
    alert('cập nhật thành công');
  }


}
