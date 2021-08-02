import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {Category} from '../../model/category';
import {CategoryService} from '../../service/category.service';
import {Product} from '../../model/product';

@Component({
  selector: 'app-product-create',
  templateUrl: 'product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  productObj: Product;
  categories: Category[];
  productForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
    category: new FormControl(),
  });




  constructor(private productService: ProductService, private categoryService: CategoryService) { }

  ngOnInit(): void {
    this.getCategory();
  }
  getCategory() {
    this.categoryService.getAll().subscribe(next => {
      this.categories = next;
    });
  }

  submit() {
    this.productObj = this.productForm.value;
    // const category = this.categoryService.findById(this.productForm.value.category).subscribe();
    // this.productObj.category = category;

    this.productService.saveProduct(this.productObj).subscribe();
    this.productForm.reset();
    alert('Cập nhật thành công');
  }

}
