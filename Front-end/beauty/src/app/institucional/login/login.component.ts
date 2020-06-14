import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { LoginService } from "./login.service";

@Component({
  selector: "a-login",
  templateUrl: "./login.component.html",
  styles: [],
})
export class LoginComponent implements OnInit {
  user = "";
  password = "";

  constructor(private router: Router, private loginService: LoginService) {}

  ngOnInit() {}

  logar() {
    this.loginService.post(this.user, this.password).subscribe((r) => {
      localStorage.setItem("access_token_ads04", r.access_token);
      this.router.navigate(["/"]);
      console.log(r);
    });
  }
}
