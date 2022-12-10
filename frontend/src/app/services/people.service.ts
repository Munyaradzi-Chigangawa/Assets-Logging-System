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
    return this.httpClient.get<People[]>(`${this.baseUrl}/get-people`);
  }

  //  Get Person
  public getPerson(peopleId: number): Observable<People> {
    return this.httpClient.get<People>(`${this.baseUrl}/get-person/${peopleId}`)
  }

  // Delete Person
  public deletePerson(peopleId: number): Observable<void> {
    return this.httpClient.delete<void>(`${this.baseUrl}/delete-person/${peopleId}`)
  }

  //  Update Person
  public updatePerson(peopleId: number, people: People): Observable<People> {
    return this.httpClient.put<People>(`${this.baseUrl}/update-person/${peopleId}`, people)
  }


}
