import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';


import { ProductRoutingModule } from './product-routing.module';
import {ProductListComponent} from './product-list/product-list.component';
import {ProductCreateComponent} from './product-create/product-create.component';
import {ProductEditComponent} from './product-edit/product-edit.component';
import {ProductDetailComponent} from './product-detail/product-detail.component';
import {ProductComponent} from './product.component';
import {ProductDeleteComponent} from './product-delete/product-delete.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatSliderModule} from '@angular/material/slider';
import {MatFormFieldModule} from '@angular/material/form-field';


@NgModule({
  declarations: [
    ProductListComponent,
    ProductCreateComponent,
    ProductEditComponent,
    ProductDetailComponent,
    ProductComponent,
    ProductDeleteComponent,
  ],
  // exports: [
  //   ProductListComponent,
  //   ProductCreateComponent,
  //   ProductEditComponent,
  //   ProductDetailComponent,
  //   ProductComponent,
  //   ProductDeleteComponent,
  // ],
  imports: [
    CommonModule,
    ProductRoutingModule,
    ReactiveFormsModule,
    NgxPaginationModule,
    FormsModule,
    Ng2SearchPipeModule,
    // BrowserAnimationsModule,
    MatSliderModule,
    MatFormFieldModule,
  ]
})
export class ProductModule { }
