import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Employee} from '../models/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private readonly API_URL = '';
  // tslint:disable-next-line:variable-name
  constructor(private _httpClient: HttpClient) { }

  getAllEmployee(): Observable<Employee[]> {
    return this._httpClient.get<Employee[]>(this.API_URL);

  }
}
