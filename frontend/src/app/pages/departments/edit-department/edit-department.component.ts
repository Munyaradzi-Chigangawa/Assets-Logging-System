import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Department } from 'src/app/models/department';
import { DepartmentService } from 'src/app/services/department.service';

@Component({
  selector: 'app-edit-department',
  templateUrl: './edit-department.component.html',
})
export class EditDepartmentComponent implements OnInit {
  private departmentId!: number;
  department: Department = new Department();

  constructor(private departmentService: DepartmentService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.departmentId = this.route.snapshot.params['departmentId'];
    this.departmentService.getDepartment(this.departmentId).subscribe(
      (data: Department) => {
        this.department = data;
      },
     (error: any) => console.log(error)
    );
  }

  // Submit
  onSubmit() {
    this.updateDepartment();
  }


  // Update Department
  updateDepartment() {
    this.departmentService.updateDepartment(this.departmentId, this.department).subscribe(
      data => {
        alert("Department Updated Successfully") 
      },
      error => console.log(error)
    );
  }
}
