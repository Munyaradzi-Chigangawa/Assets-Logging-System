import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { from } from 'rxjs';
import { Projector } from 'src/app/models/projector';
import { ProjectorService } from 'src/app/services/projector.service';

@Component({
  selector: 'app-add-projector',
  templateUrl: './add-projector.component.html',
})
export class AddProjectorComponent implements OnInit {

  projector: Projector = new Projector();

  constructor(private projectorService: ProjectorService, private router: Router, private toastr: ToastrService) { }

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
        //this.showNotification();
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

  showNotification() {
    this.toastr.success('<span class="tim-icons icon-bell-55" [data-notify]="icon"></span> Welcome to <b>Black Dashboard Angular</b> - a beautiful freebie for every web developer.', '', {
      disableTimeOut: true,
      closeButton: true,
      enableHtml: true,
      toastClass: "alert alert-success alert-with-icon",
      // positionClass: 'toast-' + from + '-'
    });
  }
}