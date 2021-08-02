import {Component, Inject, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {
  productForm: FormGroup;

  constructor(public dialogRef: MatDialogRef<ProductDetailComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any ) {
    this.productForm = new FormGroup({
      id: new FormControl(this.data.id),
      name: new FormControl(this.data.name),
      price: new FormControl(this.data.price),
      description: new FormControl(this.data.description),
      category: new FormControl(this.data.category.name)
    });

  }

  ngOnInit(): void {
  }

}
