import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { HttpClient, HttpClientModule } from "@angular/common/http";
import { RouterModule } from "@angular/router";
import { ToastrModule } from 'ngx-toastr';

import { AppComponent } from "./app.component";
import { AdminLayoutComponent } from "./layouts/admin-layout/admin-layout.component";
import { AuthLayoutComponent } from './layouts/auth-layout/auth-layout.component';

import { NgbModule } from "@ng-bootstrap/ng-bootstrap";

import { AppRoutingModule } from "./app-routing.module";
import { ComponentsModule } from "./components/components.module";
import { BookingsComponent } from './pages/bookings/bookings.component';
import { LaptopsComponent } from './pages/laptops/laptops.component';
import { ProjectorsComponent } from './pages/projectors/projectors.component';
import { DepartmentsComponent } from './pages/departments/departments.component';
import { PeopleComponent } from './pages/people/people.component';
import { AuthGuardService } from "./services/auth-guard.service";
import { AddProjectorComponent } from './pages/projectors/add-projector/add-projector.component';
import { EditProjectorComponent } from './pages/projectors/edit-projector/edit-projector.component';
import { ViewProjectorComponent } from './pages/projectors/view-projector/view-projector.component';
import { AddDepartmentComponent } from './pages/departments/add-department/add-department.component';
import { EditDepartmentComponent } from './pages/departments/edit-department/edit-department.component';
import { ViewDepartmentComponent } from './pages/departments/view-department/view-department.component';
import { EditBookingComponent } from './pages/bookings/edit-booking/edit-booking.component';

@NgModule({
  imports: [
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
    ComponentsModule,
    NgbModule,
    RouterModule,
    AppRoutingModule,
    ToastrModule.forRoot()
  ],
  declarations: [AppComponent, AdminLayoutComponent, AuthLayoutComponent, BookingsComponent, LaptopsComponent, ProjectorsComponent, DepartmentsComponent, PeopleComponent, AddProjectorComponent, EditProjectorComponent, ViewProjectorComponent, AddDepartmentComponent, EditDepartmentComponent, ViewDepartmentComponent, EditBookingComponent],
  providers: [AuthGuardService],
  bootstrap: [AppComponent]
})
export class AppModule { }
