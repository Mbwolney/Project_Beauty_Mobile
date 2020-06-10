import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { environment } from "src/environments/environment";
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: "root",
})
export class LoginService {
  constructor(private http: HttpClient) {}

  post(user, password): Observable<any> {
    return this.http.post(`${environment.apiUrl}/login`, {
      user: user,
      password: password,
    });
  }
}
