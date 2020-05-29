import { Component } from "@angular/core";
import { Router } from "@angular/router";
import { AuthenticationService } from "./componentes/services";
import { User } from "./componentes/models";

@Component({
  selector: "a-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"],
})
export class AppComponent {
  title = "beauty";
}
