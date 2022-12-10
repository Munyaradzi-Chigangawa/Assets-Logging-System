import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { People } from 'src/app/models/people';
import { PeopleService } from 'src/app/services/people.service';

@Component({
  selector: 'app-edit-people',
  templateUrl: './edit-people.component.html',
})
export class EditPeopleComponent implements OnInit {

  private peopleId: number;
  people: People = new People();

  constructor(
    private peopleService: PeopleService, private route: ActivatedRoute, private router: Router
  ) { }

  ngOnInit(): void {
    this.peopleId = this.route.snapshot.params['peopleId'];
    this.peopleService.getPerson(this.peopleId).subscribe(
      (data: People) => {
        this.people = data;
      },
     (error: any) => console.log(error)
    );
    
  }

}
