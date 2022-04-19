import { AuthService } from './../services/auth.service';
import { Component } from '@angular/core';
import { Router,ActivatedRoute } from "@angular/router";

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  invalidLogin: boolean; 

  constructor(
    private router: Router,
    private route: ActivatedRoute, 
    private authService: AuthService) { }

  // signIn(credentials) {
  //   this.authService.login(credentials)
  //     .subscribe(result => { 
  //       if (result)
  //         this.router.navigate(['/']);
  //       else  
  //         this.invalidLogin = true; 
  //     });
  // }

  signIn(credentials:any) {
    this.authService.login(credentials)
      .subscribe((result:any) => { 
        if (result) {
          let returnUrl = this.route.snapshot.queryParamMap
          this.router.navigate([returnUrl || '/']);
        }
        else  
          this.invalidLogin = true; 
    });  
}
