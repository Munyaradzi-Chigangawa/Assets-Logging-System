import { Component, OnInit } from '@angular/core';
import { People } from 'src/app/models/people';
import { PeopleService } from 'src/app/services/people.service';

@Component({
  selector: 'app-people',
  templateUrl: './people.component.html',
})
export class PeopleComponent implements OnInit {

  people: People[];
  peopleId: number;

  constructor(
    private peopleService: PeopleService,

  ) { }

  ngOnInit(): void {
    this.allPeople();
  }


  // Get all people
  public allPeople() {
    this.peopleService
    .getAllPeopleList()
    .subscribe(
    (
      data: People[]) => {
      this.people = data
    console.log(data)}
    )
  }
}