import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate {

  constructor( private router: Router) {}
  
  canActivate(
    _route: ActivatedRouteSnapshot, 
    _state: RouterStateSnapshot)
    : boolean  {
    
    if (localStorage.getItem('token') != null) {
      return true;
    }
    
    this.router.navigate(['login']);
    return false;
  }

}



