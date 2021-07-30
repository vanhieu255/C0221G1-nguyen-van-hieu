import {Component, Inject, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ProductService} from '../../service/product.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {Category} from '../../model/category';
import {CategoryService} from '../../service/category.service';
import {Product} from '../../model/product';
import {dashCaseToCamelCase} from '@angular/compiler/src/util';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';

class ProductDelComponent {
}

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
              @Inject(MAT_DIALOG_DATA) public data: any , private router: Router ) {
    // this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
    //   this.id = +paramMap.get('id');
      this.productService.findById(this.data.id).subscribe(next => {
        // this.product = next;
        this.productForm = new FormGroup({
          // id: new FormControl(this.product.id),
          // name: new FormControl(this.product.name),
          // price: new FormControl(this.product.price),
          // description: new FormControl(this.product.description),
          // category: new FormControl(this.product.category.name)

          id: new FormControl(this.data.id),
          name: new FormControl(this.data.name),
          price: new FormControl(this.data.price),
          description: new FormControl(this.data.description),
          category: new FormControl(this.data.category)
        });
      });
    // });
  }

  onNoClick(): void {
    this.dialogRef.close();
  }
  ngOnInit(): void {
  this.categoryService.getAll().subscribe(next => {
    this.categorys = next;
  });

  }



  updateProduct() {
    this.product = this.productForm.value;
    this.productService.updateProduct(this.product.id, this.product).subscribe(
      next => {
        this.router.navigate([this.dialogRef.close()]);
      }
    );
    alert('Cập nhật thành công');

  }

}
