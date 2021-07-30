import { Injectable } from '@angular/core';
import {Product} from '../model/product';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {


  public api_url = 'http://localhost:3000/products';
  // products: Product[] = [{
  //   id: 1,
  //   name: 'IPhone 12',
  //   price: 2400000,
  //   description: 'New',
  //   category: {
  //     id: 1,
  //     name: 'IPhone',
  //   }
  // }, {
  //   id: 2,
  //   name: 'IPhone 11',
  //   price: 1560000,
  //   description: 'Like new',
  //   category : {
  //     id: 2,
  //     name: 'Samsung',
  //   }
  // }, {
  //   id: 3,
  //   name: 'IPhone X',
  //   price: 968000,
  //   description: '97%',
  //   category: {
  //     id: 3,
  //     name: 'LG',
  //   }
  // }, {
  //   id: 4,
  //   name: 'IPhone 8',
  //   price: 7540000,
  //   description: '98%',
  //   category: {
  //     id: 3,
  //     name: 'LG',
  //   }
  // }, {
  //   id: 5,
  //   name: 'IPhone 11 Pro',
  //   price: 1895000,
  //   description: 'Like new',
  //   category: {
  //     id: 1,
  //     name: 'IPhone',
  //   }
  // }];

  constructor(private http: HttpClient) { }
  getAll(): Observable<Product[]> {
    return this.http.get<Product[]>(this.api_url);
  }
  saveProduct(product): Observable<Product> {
    return this.http.post(this.api_url, product);
  }
  findById(id: number): Observable<Product> {
    return this.http.get<Product>(`${this.api_url}/${id}`);
  }

  updateProduct(id: number, product: Product): Observable<Product> {
    return this.http.put<Product>(`${this.api_url}/${id}`, product);
  }

  deleteProduct(id: number): Observable<Product> {
    return this.http.delete<Product>(`${this.api_url}/${id}`);
  }

  search(searchText: string): Observable<any> {
    return this.http.get(this.api_url + '?name_like=' + searchText);
  }
}
