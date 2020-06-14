import { Component, OnInit } from "@angular/core";
import { LoginsalaoService } from "./loginsalao.service";
import { Router } from "@angular/router";

@Component({
  selector: "a-loginsalao",
  templateUrl: "./loginsalao.component.html",
  styles: [],
})
export class LoginsalaoComponent implements OnInit {
  user = "";
  password = "";

  constructor(
    private router: Router,
    private loginsalaoService: LoginsalaoService
  ) {}

  ngOnInit() {}

  logar() {
    this.loginsalaoService.post(this.user, this.password).subscribe((r) => {
      localStorage.setItem("access_token_ads04", r.access_token);
      this.router.navigate(["/"]);
      console.log(r);
    });
  }
}
