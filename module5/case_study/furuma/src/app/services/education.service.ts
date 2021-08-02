import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Education} from "../models/education";

@Injectable({
  providedIn: 'root'
})
export class EducationService {
  public api_url = ' http://localhost:3000/education';

  constructor(private http: HttpClient) { }
  getAll(): Observable<Education[]> {
    return  this.http.get<Education[]>(this.api_url);
  }
}
