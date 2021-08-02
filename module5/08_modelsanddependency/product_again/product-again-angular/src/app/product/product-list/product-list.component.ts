import { Component, OnInit } from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';
import {MatDialog} from '@angular/material/dialog';
import {ProductDeleteComponent} from '../product-delete/product-delete.component';
import {ProductEditComponent} from '../product-edit/product-edit.component';
import {ProductDetailComponent} from '../product-detail/product-detail.component';
import {CategoryService} from '../../service/category.service';
import {Category} from '../../model/category';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products: Product[] = [];
  categories: Category[] = [];
  config: any;
  searchText: any;
  searchText1: any;
  searchText2: any;
  p: any;

  constructor(private productService: ProductService, private categoryService: CategoryService, public dialog: MatDialog) {
    this.config = {
      itemsPerPage: 2,
      currentPage: 1,
    totalItems: this.products.length
    };
  }

  ngOnInit(): void {
    this.getAll();
    this.getAllCategory();
  }
  getAll() {
    this.productService.getAll().subscribe(next => {
      this.products = next;
    });
  }
  getAllCategory() {
    this.categoryService.getAll().subscribe(next =>{
      this.categories = next;
    });
  }
  pageChanged(event) {
    console.log(event);
    this.config.currentPage = event;
  }

  search() {
    this.productService.search(this.searchText, this.searchText1, this.searchText2).subscribe(next => {
      this.products = next;
    });
  }

  onDeleteHandler(id: number): void {
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
    const dialogRef = this.dialog.open( ProductEditComponent, {
      width: '500px',
      data: product
    });

    dialogRef.afterClosed().subscribe(result => {
      this.getAll();
    });
  }



  onDetailHandler(product: Product) {
    const dialogRef = this.dialog.open( ProductDetailComponent, {
      width: '500px',
      data: product
    });
  }
}
