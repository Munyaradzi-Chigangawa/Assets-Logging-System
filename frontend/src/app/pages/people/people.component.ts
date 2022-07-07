import { Component, OnInit } from '@angular/core';
import { People } from 'src/app/models/people';

@Component({
  selector: 'app-people',
  templateUrl: './people.component.html',
})
export class PeopleComponent implements OnInit {

  people: People[];

  constructor() { }

  ngOnInit(): void {
  }

}
