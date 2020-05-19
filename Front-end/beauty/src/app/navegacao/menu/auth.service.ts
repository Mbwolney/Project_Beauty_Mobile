import { Injectable, EventEmitter } from "@angular/core";
import { Router } from "@angular/router";

@Injectable({
  providedIn: "root",
})
export class AuthService {
  private usuarioAutenticado: boolean = false;

  mostrarCadastro = new EventEmitter<boolean>();

  constructor(private router: Router) {}

  usuarioEstaAutenticado() {
    return this.usuarioAutenticado;
  }
}
