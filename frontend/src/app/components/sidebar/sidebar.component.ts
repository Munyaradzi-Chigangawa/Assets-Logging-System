import { Component, OnInit } from "@angular/core";

declare interface RouteInfo {
  path: string;
  title: string;
  icon: string;
  class: string;
}
export const ROUTES: RouteInfo[] = [
  {
    path: "/dashboard",
    title: "Dashboard",
    icon: "icon-chart-pie-36",
    class: ""
  },
  {
    path: "/bookings",
    title: "Bookings",
    icon: "icon-atom",
    class: ""
  },
  {
    path: "/laptops",
    title: "Laptops",
    icon: "icon-laptop",
    class: "" 
  },

  {
    path: "/projectors",
    title: "Projectors",
    icon: "icon-components",
    class: ""
  },

  {
    path: "/departments",
    title: "Departments",
    icon: "icon-bank",
    class: ""
  },

  {
    path: "/people",
    title: "People",
    icon: "icon-vector",
    class: ""
  },

  {
    path: "/user",
    title: "My Profile",
    icon: "icon-single-02",
    class: ""
  },
  {
    path: "/tables",
    title: "Logout",
    icon: "icon-button-power",
    class: ""
  },
];

@Component({
  selector: "app-sidebar",
  templateUrl: "./sidebar.component.html",
  styleUrls: ["./sidebar.component.css"]
})
export class SidebarComponent implements OnInit {
  menuItems: any[];

  constructor() {}

  ngOnInit() {
    this.menuItems = ROUTES.filter(menuItem => menuItem);
  }
  isMobileMenu() {
    if (window.innerWidth > 991) {
      return false;
    }
    return true;
  }
}
