import { Component, OnInit } from '@angular/core';
import { Department } from 'src/app/models/department';
import { DepartmentService } from 'src/app/services/department.service';


@Component({
  selector: 'app-departments',
  templateUrl: './departments.component.html',
})
export class DepartmentsComponent implements OnInit {

  departments: Department[];

  constructor(private departmentService: DepartmentService) { }

  ngOnInit(): void {
    this.getDepartments();
  }

  private getDepartments() {
    this.departmentService
    .getDepartmentsList()
    .subscribe(
    data => {
      this.departments = data
    console.log(data)},
    );
  }

}
