import {Injectable} from '@angular/core';
import {Customer} from '../models/customer';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";


@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  public api_url = 'http://localhost:3000/customer'

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Customer[]> {
    return this.http.get<Customer[]>(this.api_url);
  }

  saveCustomer(customer: Customer): Observable<Customer> {
    return this.http.post<Customer>(this.api_url, customer);
  }

  findById(id: number): Observable<Customer> {
    return this.http.get<Customer>(`${this.api_url}/${id}`);
  }
  updateCustomer(id: number, customer: Customer): Observable<Customer> {
    return this.http.put<Customer>(`${this.api_url}/${id}`, customer);
  }
  deleteCustomer(id: number): Observable<Customer> {
    return this.http.delete<Customer>(`${this.api_url}/${id}`);
  }
  search(searchText: string): Observable<any> {
    return this.http.get(this.api_url + '?hoTen_like=' + searchText);
  }
}
