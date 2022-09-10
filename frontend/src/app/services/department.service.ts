import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Department } from '../models/department';

@Injectable({
  providedIn: 'root'
})
export class DepartmentService {

  private baseUrl = 'http://localhost:8080/api/v1';

  constructor(private httpClient: HttpClient) { }

  getDepartmentsList() : Observable<Department[]> {
    return this.httpClient.get<Department[]>(`${this.baseUrl}/getDepartments`);
  }
}
