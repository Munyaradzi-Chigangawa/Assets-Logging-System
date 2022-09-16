import { Component, OnInit } from '@angular/core';
import { Department } from 'src/app/models/department';
import { DepartmentService } from 'src/app/services/department.service';


@Component({
  selector: 'app-departments',
  templateUrl: './departments.component.html',
})
export class DepartmentsComponent implements OnInit {

  departmentId: number;
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

  // Delete Department
  public deleteDepartment(departmentId: number) {
    this.departmentService.deleteDepartment(departmentId).subscribe(
      (response: void) => {
        console.log(response);
        alert("Department deleted successfully");
        this.getDepartments();
      },
      (error: any) => console.log(error)
    );
  }

}
