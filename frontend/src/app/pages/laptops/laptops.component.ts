import { Component, OnInit } from '@angular/core';
import { Laptop } from 'src/app/models/laptop';

@Component({
  selector: 'app-laptops',
  templateUrl: './laptops.component.html',
})
export class LaptopsComponent implements OnInit {

  laptops: Laptop[];

  constructor() { }

  ngOnInit(): void {
  }

}
