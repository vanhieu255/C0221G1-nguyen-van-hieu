import { Component, OnInit } from '@angular/core';
import {CustomerService} from "../../../services/customer.service";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.css']
})
export class CustomerAddComponent implements OnInit {
  customerForm: FormGroup = new FormGroup({
    idKhachHang: new FormControl(),
    idLoaiKhach: new FormControl(),
    hoTen: new FormControl(),
    ngaySinh: new FormControl(),
    soCMND: new FormControl(),
    sdt: new FormControl(),
    email: new FormControl(),
    diaChi: new FormControl(),
  });
  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
  }
  submit() {
    const customer = this.customerForm.value;
    this.customerService.saveCustomer(customer);
    this.customerForm.reset();
  }

}
