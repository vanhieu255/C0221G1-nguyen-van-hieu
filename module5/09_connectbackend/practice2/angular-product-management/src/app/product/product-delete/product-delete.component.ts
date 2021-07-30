import {Component, Inject, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {
  // productForm: FormGroup ;
  // id: number;
  // private product: Product;
  // constructor(private productService: ProductService,
  //             private router: Router,
  //             private activatedRoute: ActivatedRoute) {
  //   this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
  //     this.id = +paramMap.get('id');
  //     this.productService.findById(this.id).subscribe(next => {
  //       this.product = next;
  //       this.productForm = new FormGroup({
  //         id: new FormControl(this.product.id),
  //         name: new FormControl(this.product.name),
  //         price: new FormControl(this.product.price),
  //         description: new FormControl(this.product.description),
  //         category: new FormControl(this.product.category.name),
  //       });
  //     });
  //   });
  // }
  constructor(public dialogRef: MatDialogRef<ProductDeleteComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              private productService: ProductService) {
  }
  onNoClick(): void {
    this.dialogRef.close();
  }

  ngOnInit(): void {
  }

  deleteProduct() {
    // this.productService.deleteProduct(this.id).subscribe();
    // this.router.navigate(['/product/list']);
  }

}
