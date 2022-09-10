import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/models/user';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
})
export class LoginComponent implements OnInit {
  username = '';
  password = '';

  user: User = new User();

  constructor(
    private userService: UserService,
    private router: Router
    ) { }

  ngOnInit(): void {
  }

   // Sign In
   signIn() {
    this.userService.login(this.user).subscribe(
      (response: any) => {
        alert("Login successful");
        console.log(response);
        this.router.navigate(['/dashboard']);
        localStorage.setItem("token", response.token);
      },

      (error: any) => {
        console.log(error)
        alert("Invalid Credentials");
        this.ngOnInit();
      }

    );
  }

}
