import { Component, OnInit } from '@angular/core';
import { Bookings } from 'src/app/models/bookings';
import { BookingService } from 'src/app/services/booking.service';

@Component({
  selector: 'app-bookings',
  templateUrl: './bookings.component.html',
})
export class BookingsComponent implements OnInit {
  bookingId: number;
  bookings: Bookings[];

  constructor(
    private bookingService: BookingService
  ) { }

  ngOnInit(): void {
    this.getAllBookings();
  }

  // Get All Bookings
  public getAllBookings() {
    this.bookingService
    .getBookingsList()
    .subscribe(
    (
      data: Bookings[]) => {
      this.bookings = data
    console.log(data)}
    )
  }

}
