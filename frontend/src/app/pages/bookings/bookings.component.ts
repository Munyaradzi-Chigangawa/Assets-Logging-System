import { Component, OnInit } from '@angular/core';
import { Bookings } from 'src/app/models/bookings';

@Component({
  selector: 'app-bookings',
  templateUrl: './bookings.component.html',
})
export class BookingsComponent implements OnInit {

  bookings: Bookings[];

  constructor() { }

  ngOnInit(): void {
  }

}
