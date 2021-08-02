import {Component, Inject, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {Category} from '../../model/category';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';
import {ActivatedRoute, Router} from '@angular/router';
import {CategoryService} from '../../service/category.service';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  productForm: FormGroup ;
  id: number;
  categorys: Category[] ;
  private product: Product;


  constructor(private productService: ProductService, private activatedRoute: ActivatedRoute, private categoryService: CategoryService,
              public dialogRef: MatDialogRef<ProductEditComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any , private router: Router) {
    this.productForm = new FormGroup({
      id: new FormControl(this.data.id),
      name: new FormControl(this.data.name),
      price: new FormControl(this.data.price),
      description: new FormControl(this.data.description),
      category: new FormControl(this.data.category)
    });
  }

  ngOnInit(): void {
    this.categoryService.getAll().subscribe(next => {
      this.categorys = next;
    });
  }
  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }
  updateProduct() {
    this.product = this.productForm.value;
    this.productService.updateProduct(this.product.id, this.product).subscribe();
    alert('Cập nhật thành công');

  }

}
