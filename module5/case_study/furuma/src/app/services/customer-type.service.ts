import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from "rxjs";
import {CustomerType} from "../models/customer-type";

@Injectable({
  providedIn: 'root'
})
export class CustomerTypeService {
  public api_url = ' http://localhost:3000/customerType'

  constructor(private http: HttpClient) { }
  getAll(): Observable<CustomerType[]> {
    return this.http.get<CustomerType[]>(this.api_url);
  }
}
