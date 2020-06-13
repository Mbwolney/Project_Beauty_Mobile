//import { NgModule } from "@angular/core";
import { Routes } from "@angular/router";
import { ContatoComponent } from "./institucional/contato/contato.component";
import { HomeComponent } from "./navegacao/home/home.component";
import { SobreComponent } from "./institucional/sobre/sobre.component";
import { LoginComponent } from "./institucional/login/login.component";
import { ClienteComponent } from "./cadastro/cliente/cliente.component";
import { SalaoComponent } from "./cadastro/salao/salao.component";
import { MenuComponent } from "./navegacao/menu/menu.component";
import { LoginsalaoComponent } from "./institucional/loginsalao/loginsalao.component";
import { AuthGuard } from "./auth.guard";

export const rota: Routes = [
  { path: "", redirectTo: "home", pathMatch: "full" },
  { path: "home", component: HomeComponent },
  { path: "contato", component: ContatoComponent },
  { path: "sobre", component: SobreComponent },
  { path: "login", component: LoginComponent },
  { path: "loginSalao", component: LoginsalaoComponent },
  { path: "menu", component: MenuComponent },
  { path: "cliente", component: ClienteComponent, canActivate: [AuthGuard] },
  { path: "salao", component: SalaoComponent, canActivate: [AuthGuard] },
];

// @NgModule({
//   imports: [RouterModule.forRoot(routes)],
//   exports: [RouterModule],
// })
// export class AppRoutingModule {}
