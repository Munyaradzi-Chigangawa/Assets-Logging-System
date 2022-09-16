import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Projector } from '../models/projector';


@Injectable({
  providedIn: 'root'
})
export class ProjectorService {

  private baseUrl = 'http://localhost:8080/api/v1';

  constructor(private httpClient: HttpClient) { }

  // Consuming Read All Endpoint
  getProjectorsList(): Observable<Projector[]> {
    return this.httpClient.get<Projector[]>(`${this.baseUrl}/getProjectors`);
  }

  // Consuming Create Endpoint
  public addProjector(projector: Projector): Observable<Projector> {
    return this.httpClient.post<Projector>(`${this.baseUrl}/addProjector`, projector)
  }

  // Consuming Delete Endpoint
  public deleteProjector(projectorId: number): Observable<void> {
    return this.httpClient.delete<void>(`${this.baseUrl}/deleteProjector/${projectorId}`)
  }

  // Consuming Read By Id Endpoint
  public getProjector(projectorId: number): Observable<Projector> {
    return this.httpClient.get<Projector>(`${this.baseUrl}/getProjector/${projectorId}`)
  }

  // Consuming Update Endpoint
  public updateProjector (projectorId: number, projector: Projector): Observable<Projector> {
    return this.httpClient.put<Projector>(`${this.baseUrl}/updateProjector/${projectorId}`, projector)
  }
}
