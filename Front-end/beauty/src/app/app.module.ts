import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { MenuComponent } from "./navegacao/menu/menu.component";
import { FooterComponent } from "./navegacao/footer/footer.component";
import { SobreComponent } from "./institucional/sobre/sobre.component";
import { ContatoComponent } from "./institucional/contato/contato.component";
import { HomeComponent } from "./navegacao/home/home.component";
import { RouterModule } from "@angular/router";
import { routes } from "./app-routing.module";
import { APP_BASE_HREF } from "@angular/common";
import { LoginComponent } from './institucional/login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    FooterComponent,
    SobreComponent,
    ContatoComponent,
    HomeComponent,
    LoginComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(routes, { useHash: false }),
  ],
  providers: [{ provide: APP_BASE_HREF, useValue: "" }],
  bootstrap: [AppComponent],
})
export class AppModule {}
