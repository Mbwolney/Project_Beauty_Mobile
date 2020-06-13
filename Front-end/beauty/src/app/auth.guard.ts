import { Injectable } from "@angular/core";
import { CanActivate, Router } from "@angular/router";

@Injectable()
export class AuthGuard implements CanActivate {
  constructor(private router: Router) {}

  canActivate() {
    if (localStorage.getItem("access_token_ads04") != null) {
      return true;
    }
    this.router.navigate(["/login"]);
    return false;
  }
}
