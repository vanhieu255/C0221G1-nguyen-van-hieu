import { Component, OnInit } from '@angular/core';
import {CategoryService} from '../../service/category.service';
import {Category} from '../../model/category';
import {normalizeExtraEntryPoints} from '@angular-devkit/build-angular/src/angular-cli-files/models/webpack-configs';

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css']
})
export class CategoryListComponent implements OnInit {

  categories: Category[] = [];

  constructor(private categoryService: CategoryService) {
  }

  ngOnInit() {
    this.getAll();
  }

  getAll() {
    this.categoryService.getAll().subscribe(next => {
      this.categories = next;
    });
  }


}
