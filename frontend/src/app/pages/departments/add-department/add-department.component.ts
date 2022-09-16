import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, CanActivate, Router } from '@angular/router';
import { Department } from 'src/app/models/department';
import { DepartmentService } from 'src/app/services/department.service';

@Component({
  selector: 'app-add-department',
  templateUrl: './add-department.component.html',
  styleUrls: ['./add-department.component.scss']
})
export class AddDepartmentComponent implements OnInit {
  private departmentId !: number;
   department: Department = new Department();
  constructor(
    private departmentService: DepartmentService, private route: ActivatedRoute, private router: Router
  ) { }

  ngOnInit(): void {
  }


  //Submit
  onSubmit() {
    this.addDepartment();
  }

  // Add Department
  addDepartment() {
    this.departmentService.addDepartment(this.department).subscribe(
      (response: Department) => {
        alert("Department Added");
        console.log(response)
      }
    )
  }
}
