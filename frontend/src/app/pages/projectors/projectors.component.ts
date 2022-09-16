import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Projector } from 'src/app/models/projector';
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

  // DeleteProjector
  public deleteProjector(projectorId: number) {
    this.projectorService.deleteProjector(projectorId).subscribe(
      (response: void) => {
        console.log(response);
        alert("Recipient deleted successfully");
        this.getProjectors();
      },
      (error: any) => console.log(error)
    );
  }

}
