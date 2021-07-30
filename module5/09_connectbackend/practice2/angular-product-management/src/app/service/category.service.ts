import { Injectable } from '@angular/core';
import {Category} from '../model/category';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Product} from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  public api_url = 'http://localhost:3000/category';

  // categories: Category[] = [{
  //   id: 1,
  //   name: 'IPhone',
  //
  // }, {
  //   id: 2,
  //   name: 'Samsung',
  // }, {
  //   id: 3,
  //   name: 'LG',
  // }];

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Category[]> {
    return this.http.get<Category[]>(this.api_url);
  }

  saveCategory(category): Observable<Category> {
    return this.http.post(this.api_url, category);
  }

  findById(id: number): Observable<Category> {
    return this.http.get<Category>(`${this.api_url}/${id}`);
  }

  updateCategory(id: number, category: Category): Observable<Category> {
    return this.http.put<Category>(`${this.api_url}/${id}`, category);
  }

  deleteCategory(id: number): Observable<Category> {
    return this.http.delete<Category>(`${this.api_url}/${id}`);
  }
}
