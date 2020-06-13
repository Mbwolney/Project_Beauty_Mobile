import { Component, OnInit } from "@angular/core";
import { Validators, FormBuilder, FormGroup } from "@angular/forms";
import { Router, ActivatedRoute } from "@angular/router";
import { first } from "rxjs/operators";
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
      localStorage.setItem("acess_token", r.acess_token);
      console.log(r);
    });
  }
}
