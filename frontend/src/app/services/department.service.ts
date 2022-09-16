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

  // Read All Departments Endpoint
  public getDepartmentsList(): Observable<Department[]> {
    return this.httpClient.get<Department[]>(`${this.baseUrl}/getDepartments`);
  }

  // Add Department Endpoint
  public addDepartment(department: Department): Observable<Department> {
    return this.httpClient.post<Department>(`${this.baseUrl}/addDepartment`, department)
  }

  // Delete Department Endpoint
  public deleteDepartment(departmentId: number): Observable<void> {
    return this.httpClient.delete<void>(`${this.baseUrl}/deleteDepartment/${departmentId}`)
  }

}
