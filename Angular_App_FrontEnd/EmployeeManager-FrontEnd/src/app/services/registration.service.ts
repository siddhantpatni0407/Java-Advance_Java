import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../classes/user';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor( private _http: HttpClient) { }

  public loginUserFromRemote(user :User):Observable<any>{
     return  this._http.post<any>(`${this.apiServerUrl}/login`, user);
  }

  public registerUserFromRemote(user :User):Observable<any>{
    return  this._http.post<any>(`${this.apiServerUrl}/registeruser`, user);
 }
 
}
