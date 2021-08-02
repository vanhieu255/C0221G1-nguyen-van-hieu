import {Component, Inject, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {Customer} from "../../../models/customer";
import {CustomerService} from "../../../services/customer.service";
import {CustomerTypeService} from "../../../services/customer-type.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {CustomerType} from "../../../models/customer-type";




@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
  customerForm: FormGroup;
  customerTypes: CustomerType[];
  id: number;
  customer: Customer;

  // tslint:disable-next-line:max-line-length
  constructor(private customerService: CustomerService, private customerTypeService: CustomerTypeService, public dialogRef: MatDialogRef<CustomerEditComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any ) {
  this.customerForm = new FormGroup({
    id: new FormControl(this.data.id),
    customerType: new FormControl(this.data.customerType),
    hoTen: new FormControl(this.data.hoTen),
    ngaySinh: new FormControl(this.data.ngaySinh),
    soCMND: new FormControl(this.data.soCMND),
    sdt: new FormControl(this.data.sdt),
    email: new FormControl(this.data.email),
    diaChi: new FormControl(this.data.diaChi)
  });
  }

  ngOnInit(): void {
    this.customerTypeService.getAll().subscribe(next => {
      this.customerTypes = next;
    });
  }
  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }
  updateCustomer() {
  this.customer = this.customerForm.value;
  this.customerService.updateCustomer(this.customer.id, this.customer).subscribe();
  alert('cập nhật thành công');

  }

}
