import { Routes } from "@angular/router";
import { DashboardComponent } from "../../pages/dashboard/dashboard.component";
import { UserComponent } from "../../pages/user/user.component";
import { BookingsComponent } from "src/app/pages/bookings/bookings.component";
import { LaptopsComponent } from "src/app/pages/laptops/laptops.component";
import { ProjectorsComponent } from "src/app/pages/projectors/projectors.component";
import { DepartmentsComponent } from "src/app/pages/departments/departments.component";
import { PeopleComponent } from "src/app/pages/people/people.component";
import { AddProjectorComponent } from "src/app/pages/projectors/add-projector/add-projector.component";
import { ViewProjectorComponent } from "src/app/pages/projectors/view-projector/view-projector.component";
import { EditProjectorComponent } from "src/app/pages/projectors/edit-projector/edit-projector.component";
import { AddDepartmentComponent } from "src/app/pages/departments/add-department/add-department.component";
import { EditDepartmentComponent } from "src/app/pages/departments/edit-department/edit-department.component";
import { ViewDepartmentComponent } from "src/app/pages/departments/view-department/view-department.component";

export const AdminLayoutRoutes: Routes = [
  { path: "dashboard", component: DashboardComponent },
  { path: "bookings", component: BookingsComponent },
  { path: "laptops", component: LaptopsComponent },
  { path: "projectors", component: ProjectorsComponent },
  { path: "departments", component: DepartmentsComponent },
  { path: "people", component: PeopleComponent },
  { path: "user", component: UserComponent },
  { path: "add-projector", component: AddProjectorComponent },
  { path: "view-projector/:projectorId", component: ViewProjectorComponent },
  { path: "edit-projector/:projectorId", component: EditProjectorComponent },
  { path: "add-department", component: AddDepartmentComponent },
  { path: "edit-department:departmentId", component: EditDepartmentComponent },
  { path: "view-department:departmentId", component: ViewDepartmentComponent }

];
