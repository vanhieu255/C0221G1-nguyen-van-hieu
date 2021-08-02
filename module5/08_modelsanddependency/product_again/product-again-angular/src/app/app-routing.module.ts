import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductListComponent} from './product/product-list/product-list.component';
import { ProductCreateComponent } from './product/product-create/product-create.component';
import {ProductEditComponent} from './product/product-edit/product-edit.component';
import {ProductDeleteComponent} from './product/product-delete/product-delete.component';
import {ProductDetailComponent} from './product/product-detail/product-detail.component';
import {CategoryListComponent} from './category/category-list/category-list.component';
import {CategoryCreateComponent} from './category/category-create/category-create.component';




const routes: Routes = [{
  path: '',
  pathMatch: 'full',
  redirectTo: 'product/list'},
  {
    path: 'product/list',
    component: ProductListComponent},
  {path: 'product/create',
    component: ProductCreateComponent
  },
  {path: 'product/edit/:id',
    component: ProductEditComponent
  },
  {path: 'product/detail/:id',
    component: ProductDetailComponent
  },
  {path: 'product/delete/:id',
    component: ProductDeleteComponent
  },
  {path: 'category/list',
    component: CategoryListComponent
  },
  {path: 'category/create',
    component: CategoryCreateComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
