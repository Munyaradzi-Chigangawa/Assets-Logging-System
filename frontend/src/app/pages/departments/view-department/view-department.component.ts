import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, CanActivate, Router } from '@angular/router';
import { Department } from 'src/app/models/department';
import { DepartmentService } from 'src/app/services/department.service';

@Component({
  selector: 'app-view-department',
  templateUrl: './view-department.component.html',
  styleUrls: ['./view-department.component.scss']
})
export class ViewDepartmentComponent implements OnInit {

private departmentId !: number;
department: Department = new Department();

  constructor(private route: ActivatedRoute, private departmentService: DepartmentService, private router: Router) { }

  ngOnInit(): void {
    this.departmentId = this.route.snapshot.params['departmentId'];
    this.departmentService.getDepartment(this.departmentId).subscribe(
      (data: Department) => {
        this.department = data;
        console.log(data);
      },
      (error: any) => console.log(error)
    );
  }

}
