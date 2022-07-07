import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProjectorService } from 'src/app/services/projector.service';

@Component({
  selector: 'app-projectors',
  templateUrl: './projectors.component.html',
})
export class ProjectorsComponent implements OnInit {

  projectors: Projector[];

  constructor( private projectorService: ProjectorService, private router: Router) { }

  ngOnInit(): void {
    this.getProjectors();
  }
  private getProjectors() {
    this.projectorService
    .getProjectorsList()
    .subscribe(
    data => {this.projectors = data
    console.log(data)},
    );
  }
}
