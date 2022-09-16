import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Projector } from 'src/app/models/projector';
import { ProjectorService } from 'src/app/services/projector.service';

@Component({
  selector: 'app-view-projector',
  templateUrl: './view-projector.component.html',
  styleUrls: ['./view-projector.component.scss']
})
export class ViewProjectorComponent implements OnInit {
  projector: Projector = new Projector();

  private projectorId!: number;
 
 
  constructor(private projectorService: ProjectorService, private route: ActivatedRoute,
    private router: Router
    ) { } 

    ngOnInit(): void {
      this.projectorId = this.route.snapshot.params['projectorId'];
      this .projectorService.getProjector(this.projectorId).subscribe(
        (data: Projector) => {
          this.projector = data;
          console.log(data);
        },
        (error: any) => console.log(error)
      );
      }  

  onSubmit() {
    this.router.navigate["projectors"]
  }

}
