import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Division} from "../models/division";

@Injectable({
  providedIn: 'root'
})
export class DivisionService {
  public api_url = 'http://localhost:3000/division';
  constructor(private http: HttpClient) { }
  getAll(): Observable<Division[]> {
    return  this.http.get<Division[]>(this.api_url);
  }
}
