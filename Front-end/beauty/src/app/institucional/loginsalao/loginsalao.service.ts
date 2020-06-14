import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { environment } from "src/environments/environment";

@Injectable({
  providedIn: "root",
})
export class LoginsalaoService {
  constructor(private http: HttpClient) {}

  post(user, password): Observable<any> {
    return this.http.post(`${environment.apiUrl}/login`, {
      user: user,
      password: password,
    });
  }
}
