import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../../../services/customer.service';
import {FormControl, FormGroup} from '@angular/forms';
import {CustomerTypeService} from '../../../services/customer-type.service';
import {CustomerType} from '../../../models/customer-type';
import {Customer} from '../../../models/customer';



@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.css']
})
export class CustomerAddComponent implements OnInit {
  customerTypes: CustomerType [];
  customerObj: Customer;
  customerForm: FormGroup = new FormGroup({
    id: new FormControl(),
    customerType: new FormControl(),
    hoTen: new FormControl(),
    ngaySinh: new FormControl(),
    soCMND: new FormControl(),
    sdt: new FormControl(),
    email: new FormControl(),
    diaChi: new FormControl(),
  });
  constructor(private customerService: CustomerService, private customerTypeService: CustomerTypeService) { }

  ngOnInit(): void {
    this.getAllCustomerType();
  }
  getAllCustomerType() {
    this.customerTypeService.getAll().subscribe(next => {
      this.customerTypes = next;
    });
  }
  submit() {
    this.customerObj = this.customerForm.value;
    console.log(this.customerObj);
    this.customerService.saveCustomer(this.customerObj).subscribe();


  }

}
