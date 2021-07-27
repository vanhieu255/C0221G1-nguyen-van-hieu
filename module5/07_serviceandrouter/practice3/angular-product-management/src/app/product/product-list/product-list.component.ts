import { Component, OnInit } from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: Product[] = [];
  config: any;
  searchText: any;
  constructor(private productService: ProductService) {
    this.config = {
      itemsPerPage: 2,
      currentPage: 1,
      totalItems: this.products.length
    };
  }

  ngOnInit(): void {
    this.getAll();
  }
  getAll() {
    this.products = this.productService.getAll();
  }

  pageChanged(event) {
    console.log(event);
    this.config.currentPage = event;
  }
}
