import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {CategoryService} from '../../service/category.service';
import {Category} from '../../model/category';

@Component({
  selector: 'app-category-create',
  templateUrl: './category-create.component.html',
  styleUrls: ['./category-create.component.css']
})
export class CategoryCreateComponent implements OnInit {
  category: Category;
  categoryForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl()
  });

  constructor(private categoryService: CategoryService) {
  }

  ngOnInit(): void {
  }

  submit() {
    this.category = this.categoryForm.value;
    this.categoryService.saveCategory(this.category).subscribe();
    this.categoryForm.reset();
    alert('tạo mới danh mục thành công');
  }
}
