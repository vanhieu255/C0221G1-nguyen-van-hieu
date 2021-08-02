import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Product} from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  public api_url = 'http://localhost:3000/products';

  constructor(private http: HttpClient) { }
getAll(): Observable<Product[]> {
    return this.http.get<Product[]>(this.api_url);
}
saveProduct(product): Observable<Product> {
    return this.http.post<Product>(this.api_url, product);
}
finById(id: number): Observable<Product> {
    return this.http.get<Product>(`${this.api_url}/${id}`);
}
updateProduct(id: number, product: Product): Observable<Product> {
    return this.http.put<Product>(`${this.api_url}/${id}`, product);
}
deleteProduct(id: number): Observable<Product> {
    return this.http.delete(`${this.api_url}/${id}`);
}
search(searchText: string, searchText1: string, searchText2: string): Observable<any> {
    return this.http.get(this.api_url + '?name_like=' + searchText + '&price_like=' + searchText1 + '&category.name_like=' + searchText2 );
}
}
