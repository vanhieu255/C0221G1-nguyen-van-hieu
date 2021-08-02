import { Component, OnInit } from '@angular/core';
import {Customer} from '../../../models/customer';
import {CustomerService} from '../../../services/customer.service';
import {CustomerTypeService} from '../../../services/customer-type.service';
import {MatDialog} from "@angular/material/dialog";
import {CustomerEditComponent} from "../customer-edit/customer-edit.component";
import {CustomerDeleteComponent} from "../customer-delete/customer-delete.component";
import {CustomerDetailComponent} from "../customer-detail/customer-detail.component";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[] = [];
  searchText: any;
  config: any;


  constructor(private customerService: CustomerService, private customerTypeService: CustomerTypeService , public dialog: MatDialog ) {
    this.config = {
      itemsPerPage: 2,
      currentPage: 1,
      totalItems: this.customers.length
    };

  }

  ngOnInit(): void {
    this.getAll();
  }
getAll() {
this.customerService.getAll().subscribe(next => {
  this.customers = next;
});
}

  pageChanged(event) {
    console.log(event);
    this.config.currentPage = event;
  }

  search() {
    this.customerService.search(this.searchText).subscribe(next => {
      this.customers = next;
    });

  }

  onEditHandler(customer: Customer) {
    const dialogRef = this.dialog.open(CustomerEditComponent, {
      width: '500px',
      data: customer
    });

    dialogRef.afterClosed().subscribe(result => {
      this.getAll();
    });

  }

  onDeleteHandler(id: number) {
    const dialogRef = this.dialog.open( CustomerDeleteComponent, {
      width: '250px',
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      console.log(result);
      if (result) {
        this.customerService.deleteCustomer(id).subscribe(next => {
          this.getAll();
        });
      }
    });


  }

  onDetailHandler(customer: Customer) {
    const dialogRef = this.dialog.open( CustomerDetailComponent, {
      width: '500px',
      data: customer
    });
  }
}
