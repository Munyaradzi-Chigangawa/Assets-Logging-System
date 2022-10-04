import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Bookings } from '../models/bookings';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  private baseUrl = 'http://localhost:8080/api/v1';

  constructor(private httpClient: HttpClient) { }

  // Get All Bookings
  public getBookingsList(): Observable<Bookings[]> {
    return this.httpClient.get<Bookings[]>(`${this.baseUrl}/get-all-bookings`);
  }


}
