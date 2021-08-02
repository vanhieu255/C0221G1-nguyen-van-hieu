import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {CustomerService} from "../../../services/customer.service";

@Component({
  selector: 'app-employee-delete',
  templateUrl: './employee-delete.component.html',
  styleUrls: ['./employee-delete.component.css']
})
export class EmployeeDeleteComponent implements OnInit {

  constructor(public dialogRef: MatDialogRef<EmployeeDeleteComponent>,  @Inject(MAT_DIALOG_DATA) public data: any,
              private customerService: CustomerService) { }

  ngOnInit(): void {
  }

}
