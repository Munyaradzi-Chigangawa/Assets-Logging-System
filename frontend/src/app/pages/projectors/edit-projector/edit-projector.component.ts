import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Projector } from 'src/app/models/projector';
import { ProjectorService } from 'src/app/services/projector.service';

@Component({
  selector: 'app-edit-projector',
  templateUrl: './edit-projector.component.html',
  styleUrls: ['./edit-projector.component.scss']
})
export class EditProjectorComponent implements OnInit {

  private projectorId!: number;
  projector: Projector = new Projector();
 

  constructor(private projectorService: ProjectorService, private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.projectorId = this.route.snapshot.params['projectorId'];
    this.projectorService.getProjector(this.projectorId).subscribe(
      (data: Projector) => {
        this.projector = data;
      },
      (error: any) => console.log(error)
    );
  }

   // Submit
   onSubmit() {
    console.log(this.projector);
    this.updateProjector();
  }


  
  // Update Projector
  updateProjector() {
    this.projectorService.updateProjector(this.projectorId, this.projector).subscribe(
      data => {
        alert("Projector Updated Successfully");
      },
      error => console.log(error));
  }

}
