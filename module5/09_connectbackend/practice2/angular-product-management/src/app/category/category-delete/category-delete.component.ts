import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {CategoryService} from '../../service/category.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {Category} from '../../model/category';

@Component({
  selector: 'app-category-delete',
  templateUrl: './category-delete.component.html',
  styleUrls: ['./category-delete.component.css']
})
export class CategoryDeleteComponent implements OnInit {

  categoryForm: FormGroup;
  id: number;
  private category: any;
  constructor(private categoryService: CategoryService,
              private router: Router,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = +paramMap.get('id');
      this.categoryService.findById(this.id).subscribe(next => {
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


  deleteCategory() {
    this.categoryService.deleteCategory(this.id).subscribe();
    this.router.navigate(['/category/list']);
  }

}
