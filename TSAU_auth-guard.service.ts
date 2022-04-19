import { AuthService } from './services/auth.service';
import { Injectable } from '@angular/core';
import { Router, CanActivate } from '@angular/router';
import { RouterStateSnapshot  } from '@angular/router';

@Injectable()
export class AuthGuard implements CanActivate {

  constructor(protected router: Router, 
        protected authService: AuthService) { }
 
  // canActivate() {
  //   canActivate(route: ActivatedRouteSnapshot,
  //       state: RouterStateSnapshot) {

  //   if (this.authService.isLoggedIn()) return true;

  //   this.router.navigate(['/login']);
  //   return false;
  // }

    canActivate(route:any, state: RouterStateSnapshot) {
      if (this.authService.isLoggedIn()) return true;

      this.router.navigate(['/login', 
!							{queryParams: {returnUrl:state.url}}]);
      //localhost:4200/login?returnUrl
      return false;	    
    }

}

