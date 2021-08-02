import { Component, OnInit } from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';
import {MatDialog} from '@angular/material/dialog';
import {ProductDeleteComponent} from '../product-delete/product-delete.component';
import {Route, Router} from '@angular/router';
import {ProductEditComponent} from '../product-edit/product-edit.component';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products!: Product[];
  config: any;
  searchText: any;

  constructor(private productService: ProductService,
              public dialog: MatDialog,
              private router: Router) {
    // this.config = {
    //   itemsPerPage: 2,
    //   currentPage: 1,
    // totalItems: this.products.length
    // };
  }

  ngOnInit(): void {
    this.getAll();
    // this.search();
  }

  getAll() {
    // this.products = this.productService.getAll();
    this.productService.getAll().subscribe(next => {
      this.products = next;
    }, error => {
      alert('lấy danh sách thức bại');
    });
  }

  search() {
    this.productService.search(this.searchText).subscribe(next => {
      this.products = next;
    });
  }

  // pageChanged(event) {
  //   console.log(event);
  //   this.config.currentPage = event;
  // }
  onDeleteHandler(id): void {
    const dialogRef = this.dialog.open(ProductDeleteComponent, {
      width: '250px',
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      console.log(result);
      if (result) {
        this.productService.deleteProduct(id).subscribe(next => {
          this.getAll();
        });
      }
    });
  }

  onEditHandler(product: Product) {
    const dialogRef = this.dialog.open(ProductEditComponent, {
      width: '500px',
      data: product
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      console.log(result);
      if (result) {
        // this.productService.updateProduct(product.id, product).subscribe(next => {
        //   this.getAll();
        // });
      }
    });
  }
}


