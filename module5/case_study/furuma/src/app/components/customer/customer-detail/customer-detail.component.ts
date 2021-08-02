import {Component, Inject, OnInit} from '@angular/core';
import {CustomerService} from "../../../services/customer.service";
import {CustomerTypeService} from "../../../services/customer-type.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-customer-detail',
  templateUrl: './customer-detail.component.html',
  styleUrls: ['./customer-detail.component.css']
})
export class CustomerDetailComponent implements OnInit {
  customerForm: FormGroup = new FormGroup({
    id: new FormControl(this.data.id),
    customerType: new FormControl(this.data.customerType.name),
    hoTen: new FormControl(this.data.hoTen),
    ngaySinh: new FormControl(this.data.ngaySinh),
    soCMND: new FormControl(this.data.soCMND),
    sdt: new FormControl(this.data.sdt),
    email: new FormControl(this.data.email),
    diaChi: new FormControl(this.data.diaChi)

  });

  constructor(private customerService: CustomerService, private customerTypeService: CustomerTypeService, public dialogRef: MatDialogRef<CustomerDetailComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any) { }

  ngOnInit(): void {
  }

}
