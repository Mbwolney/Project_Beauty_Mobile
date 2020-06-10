import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

// import { AppRoutingModule, routes } from "./app-routing.module";
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
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { AlertComponent } from "./componentes/alert/alert.component";
import { HttpClientModule } from "@angular/common/http";
import { LoginsalaoComponent } from "./institucional/loginsalao/loginsalao.component";
import { RegisterComponent } from "./institucional/register/register.component";
import { RouterModule } from "@angular/router";
import { rota } from "./app-routing.module";
import { LoginService } from "./institucional/login/login.service";
import { ClienteService } from "./cadastro/cliente/cliente.service";

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
    AlertComponent,
    LoginsalaoComponent,
    RegisterComponent,
  ],
  imports: [
    BrowserModule,
    // AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    [RouterModule.forRoot(rota, { useHash: false })],
  ],
  providers: [
    LoginService,
    ClienteService,
    { provide: APP_BASE_HREF, useValue: "" },
  ],
  bootstrap: [AppComponent],
})
export class AppModule {}
