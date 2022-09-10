import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Projector } from 'src/app/models/projector';
import { ProjectorService } from 'src/app/services/projector.service';

@Component({
  selector: 'app-add-projector',
  templateUrl: './add-projector.component.html',
})
export class AddProjectorComponent implements OnInit {

  projector: Projector = new Projector();
  
  constructor( private projectorService: ProjectorService, private router: Router) { }

  ngOnInit(): void {
  }


  // Submit
  onSubmit() {
    console.log(this.projector);
    this.addProjector();
  }


  // Add Projector
  addProjector() {
    this.projectorService.addProjector(this.projector).subscribe(
      (response: Projector) => {
        alert("Projector Added");
        console.log(response)
        this.goToProjectors();
      }
    )
  }

  // Go back to projectors
  goToProjectors() {
    this.router.navigate[("/projectors")]
  }
}
