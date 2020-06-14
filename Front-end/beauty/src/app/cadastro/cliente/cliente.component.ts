import { Component, OnInit } from "@angular/core";
import Swal from "sweetalert2";
import { ClienteService } from "./cliente.service";

@Component({
  selector: "a-cliente",
  templateUrl: "./cliente.component.html",
  styles: [],
})
export class ClienteComponent implements OnInit {
  public cliente;

  public clientes = [];

  constructor(private clienteService: ClienteService) {}

  ngOnInit() {
    this.criarCliente();
    this.listar();
  }

  criarCliente() {
    this.cliente = { nome: "", endereco: "", cpf: "" };
  }

  // salvar() {
  //   this.clienteService.salvar(this.cliente).subscribe((r) => {
  //     this.listar();
  //     this.criarCliente();
  //   });
  //   console.log(this.cliente);
  // }

  listar() {
    this.clienteService.listar().subscribe((r) => {
      this.clientes = r;
    });
  }

  // editar(c) {
  //   this.cliente = c;
  // }

  // deletar(id) {
  //   Swal.fire({
  //     text: "Tem certeza??",
  //     showCancelButton: true,
  //     cancelButtonText: "Não",
  //     confirmButtonText: "Sim, pode deletar!",
  //   }).then((result) => {
  //     if (result.value) {
  //       this.clienteService.deletar(id).subscribe((r) => {
  //         this.listar();
  //       });
  //     }
  //   });
  // }
}
