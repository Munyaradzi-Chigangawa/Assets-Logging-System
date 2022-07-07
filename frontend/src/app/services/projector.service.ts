import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ProjectorService {

  private baseUrl = 'http://localhost:8080/api/getProjectors';

  constructor(private httpClient : HttpClient) { }

  getProjectorsList() : Observable<Projector[]> {
    return this.httpClient.get<Projector[]>(`${this.baseUrl}`);
}
}
