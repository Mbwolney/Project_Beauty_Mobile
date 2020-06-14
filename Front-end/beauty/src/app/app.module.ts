import { NgModule, LOCALE_ID } from "@angular/core";

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
import { HttpClientModule, HTTP_INTERCEPTORS } from "@angular/common/http";
import { LoginsalaoComponent } from "./institucional/loginsalao/loginsalao.component";
import { RouterModule } from "@angular/router";
import { rota } from "./app-routing.module";
import { LoginService } from "./institucional/login/login.service";
import { ClienteService } from "./cadastro/cliente/cliente.service";
import { AuthInterceptor } from "./http.interceptor";
import { SalaoService } from "./cadastro/salao/salao.service";
import { ReverseStr } from "./institucional/pipe/reverse.pipe";
import { BrowserModule } from "@angular/platform-browser";

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
    LoginsalaoComponent,
    ReverseStr,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    [RouterModule.forRoot(rota, { useHash: false })],
  ],
  providers: [
    LoginService,
    ClienteService,
    SalaoService,
    { provide: APP_BASE_HREF, useValue: "" },
    {
      provide: HTTP_INTERCEPTORS,
      useClass: AuthInterceptor,
      multi: true,
    },
    { provide: LOCALE_ID, useValue: "pt-BR" },
  ],
  bootstrap: [AppComponent],
})
export class AppModule {}
