import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Category} from '../model/category';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  public api_url = 'http://localhost:3000/category';

  constructor(private http: HttpClient) { }
  getAll(): Observable<Category[]> {
    return this.http.get<Category[]>(this.api_url);
  }
  saveCategory(category): Observable<Category> {
    return this.http.post<Category>(this.api_url, category);
  }
}
