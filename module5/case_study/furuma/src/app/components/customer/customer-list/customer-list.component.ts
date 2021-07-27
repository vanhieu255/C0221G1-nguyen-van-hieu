import { Component, OnInit } from '@angular/core';
import {Customer} from '../../../models/customer';
import {CustomerService} from '../../../services/customer.service';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[] = [];
  searchText: any;
  config: any;

  constructor(private customerService: CustomerService) {
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
this.customers = this.customerService.getAll();
}

  pageChanged(event) {
    console.log(event);
    this.config.currentPage = event;
  }

}
