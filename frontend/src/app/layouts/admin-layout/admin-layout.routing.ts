import { Routes } from "@angular/router";

import { DashboardComponent } from "../../pages/dashboard/dashboard.component";
import { UserComponent } from "../../pages/user/user.component";
import { BookingsComponent } from "src/app/pages/bookings/bookings.component";
import { LaptopsComponent } from "src/app/pages/laptops/laptops.component";
import { ProjectorsComponent } from "src/app/pages/projectors/projectors.component";
import { DepartmentsComponent } from "src/app/pages/departments/departments.component";
import { PeopleComponent } from "src/app/pages/people/people.component";

export const AdminLayoutRoutes: Routes = [
  { path: "dashboard", component: DashboardComponent },
  { path: "bookings", component: BookingsComponent },
  { path: "laptops", component: LaptopsComponent },
  { path: "projectors", component: ProjectorsComponent },
  { path: "departments", component: DepartmentsComponent },
  { path: "people", component: PeopleComponent },
  { path: "user", component: UserComponent },
];
