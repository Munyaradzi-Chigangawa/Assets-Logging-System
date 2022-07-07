import { Component, OnInit } from '@angular/core';
import { Department } from 'src/app/models/department';


@Component({
  selector: 'app-departments',
  templateUrl: './departments.component.html',
})
export class DepartmentsComponent implements OnInit {

  departments: Department[];

  constructor() { }

  ngOnInit(): void {
  }

}
