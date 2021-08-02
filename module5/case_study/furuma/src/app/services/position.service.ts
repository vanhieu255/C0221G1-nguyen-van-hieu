import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Position} from "../models/position";


@Injectable({
  providedIn: 'root'
})
export class PositionService {
public api_url = 'http://localhost:3000/position';
  constructor(private http: HttpClient ) { }
  getAll(): Observable<Position[]> {
    return  this.http.get<Position[]>(this.api_url);
  }
}
