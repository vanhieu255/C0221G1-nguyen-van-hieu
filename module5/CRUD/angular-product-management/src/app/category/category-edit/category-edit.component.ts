import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {CategoryService} from '../../service/category.service';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {Category} from '../../model/category';

@Component({
  selector: 'app-category-edit',
  templateUrl: './category-edit.component.html',
  styleUrls: ['./category-edit.component.css']
})
export class CategoryEditComponent implements OnInit {

  categoryForm: FormGroup;
  id: number;
  private category: Category;

  constructor(private categoryService: CategoryService,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.categoryService.findById(this.id).subscribe(next =>{
        this.category = next;
        this.categoryForm = new FormGroup({
          id: new FormControl(this.category.id),
          name: new FormControl(this.category.name),
        });
      });
    });
  }

  ngOnInit() {
  }



  updateCategory(id: number) {
    const category = this.categoryForm.value;
    this.categoryService.updateCategory(id, category).subscribe();
    alert('Cập nhật thành công');
  }

}
