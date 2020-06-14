import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { environment } from "src/environments/environment";

@Injectable({
  providedIn: "root",
})
export class SalaoService {
  constructor(private http: HttpClient) {}

  salvar(salao: any): Observable<any> {
    return this.http.post(`${environment.apiUrl}/salao`, salao);
  }

  listar(): Observable<any> {
    return this.http.get(`${environment.apiUrl}/salao`);
  }

  deletar(id): Observable<any> {
    return this.http.delete(`${environment.apiUrl}/salao/${id}`);
  }
}
