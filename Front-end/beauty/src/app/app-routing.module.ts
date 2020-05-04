import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { ContatoComponent } from "./institucional/contato/contato.component";
import { HomeComponent } from "./navegacao/home/home.component";
import { SobreComponent } from "./institucional/sobre/sobre.component";
import { LoginComponent } from "./institucional/login/login.component";

export const routes: Routes = [
  { path: "", redirectTo: "home", pathMatch: "full" },
  { path: "home", component: HomeComponent },
  { path: "contato", component: ContatoComponent },
  { path: "sobre", component: SobreComponent },
  { path: "login", component: LoginComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
