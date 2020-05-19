import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";

@Component({
  selector: "a-menu",
  templateUrl: "./menu.component.html",
  styles: [],
})
export class MenuComponent implements OnInit {
  usuario: any;

  constructor(private router: Router) {
    this.usuario = {};
  }

  ngOnInit(): void {}

  fazerLogin(usuario) {
    console.log(usuario);
    if (usuario.email === "usuario@gmail.com" && usuario.senha === "123") {
      this.router.navigate(["/cliente"]);
    }
  }
}
