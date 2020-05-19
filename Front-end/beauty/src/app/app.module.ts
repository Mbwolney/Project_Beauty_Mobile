import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { MenuComponent } from "./navegacao/menu/menu.component";
import { FooterComponent } from "./navegacao/footer/footer.component";
import { SobreComponent } from "./institucional/sobre/sobre.component";
import { ContatoComponent } from "./institucional/contato/contato.component";
import { HomeComponent } from "./navegacao/home/home.component";
import { APP_BASE_HREF } from "@angular/common";
import { LoginComponent } from "./institucional/login/login.component";
import { ClienteComponent } from "./cadastro/cliente/cliente.component";
import { SalaoComponent } from "./cadastro/salao/salao.component";
import { AuthService } from "./guards/navegacao/menu/auth.service";
import { AuthGuard } from "./guards/guards/auth.guard";
import { FormsModule } from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    FooterComponent,
    SobreComponent,
    ContatoComponent,
    HomeComponent,
    LoginComponent,
    ClienteComponent,
    SalaoComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule],
  providers: [AuthService, AuthGuard, { provide: APP_BASE_HREF, useValue: "" }],
  bootstrap: [AppComponent],
})
export class AppModule {}
