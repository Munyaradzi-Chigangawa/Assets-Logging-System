import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { People } from '../models/people';

@Injectable({
  providedIn: 'root'
})
export class PeopleService {

  constructor( private httpClient: HttpClient) { }

  private baseUrl = 'http://localhost:8080/api/v1';

  // Get All People
  public getAllPeopleList(): Observable<People[]> {
    return this.httpClient.get<People[]>(`${this.baseUrl}/getPeople`);
  }
  

}
