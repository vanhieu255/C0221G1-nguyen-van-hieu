import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Customer} from "../models/customer";
import {Employee} from "../models/employee";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  public api_url = 'http://localhost:3000/employee';
  constructor(private http: HttpClient) { }
  getAll(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.api_url);
  }

  saveEmployee(employee: Employee): Observable<Customer> {
    return this.http.post<Employee>(this.api_url, employee);
  }

  findById(id: number): Observable<Employee> {
    return this.http.get<Employee>(`${this.api_url}/${id}`);
  }
  updateEmployee(id: number, employee: Employee): Observable<Employee> {
    return this.http.put<Employee>(`${this.api_url}/${id}`, employee);
  }
  deleteEmployee(id: number): Observable<Employee> {
    return this.http.delete<Employee>(`${this.api_url}/${id}`);
  }
  search(searchText: string): Observable<any> {
    return this.http.get(this.api_url + '?hoTen_like=' + searchText);
  }
}
