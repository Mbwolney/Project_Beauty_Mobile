import { Component, OnInit } from "@angular/core";
import Swal from "sweetalert2";
import { SalaoService } from "./salao.service";

@Component({
  selector: "a-salao",
  templateUrl: "./salao.component.html",
  styles: [],
})
export class SalaoComponent implements OnInit {
  public salao;

  public saloes = [];

  constructor(private salaoService: SalaoService) {}

  ngOnInit() {
    this.criarSalao();
    this.listar();
  }

  criarSalao() {
    this.salao = {
      nome: "",
      endereco: "",
      cnpj: "",
      servico: "",
      funcionario: "",
    };
  }

  salvar() {
    this.salaoService.salvar(this.salao).subscribe((r) => {
      this.listar();
      this.criarSalao();
    });
    console.log(this.salao);
  }

  listar() {
    this.salaoService.listar().subscribe((r) => {
      this.saloes = r;
    });
  }

  editar(s) {
    this.salao = s;
  }

  deletar(id) {
    Swal.fire({
      text: "Tem certeza??",
      showCancelButton: true,
      cancelButtonText: "Não",
      confirmButtonText: "Sim, pode deletar!",
    }).then((result) => {
      if (result.value) {
        this.salaoService.deletar(id).subscribe((r) => {
          this.listar();
        });
      }
    });
  }
}
