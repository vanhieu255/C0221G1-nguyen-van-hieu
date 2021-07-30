import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {Category} from '../../model/category';
import {CategoryService} from '../../service/category.service';
import {Product} from '../../model/product';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  productForm: FormGroup ;
  id: number;
  categorys: Category[] = [];
  product: Product;

  constructor(private productService: ProductService, private activatedRoute: ActivatedRoute, private categoryService: CategoryService) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      const product = this.getProduct(this.id);
      this.productForm = new FormGroup({
        id: new FormControl(product.id),
        name: new FormControl(product.name),
        price: new FormControl(product.price),
        description: new FormControl(product.description),
        category: new FormControl(product.category.id)
      });
    });
  }

  ngOnInit(): void {
    this.categorys = this.categoryService.getAll();
  }
  getProduct(id: number) {
    return this.productService.findById(id);
  }
  updateProduct(id: number) {
    this.product = this.productForm.value;
    const category = this.categoryService.findById(this.productForm.value.category);
    this.product.category = category;
    this.productService.updateProduct(id, this.product);
    alert('Cập nhật thành công');

  }

}
