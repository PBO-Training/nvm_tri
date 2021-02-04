import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': '*',
    'Access-Control-Allow-Methods': 'POST, GET, OPTIONS, DELETE, PUT',
    // 'Authorization': 'my-auth-token',
    'Access-Control-Allow-Headers': 'X-Requested-With, Content-Type,Origin, Authorization, Accept,Client-Security-Token, Accept-Encoding, X-Auth-Token, content-type'
  })
}
@Injectable({
  providedIn: 'root'
})
export class ConnectApiService {
  private REST_API_SERVER = 'http://localhost:8080'

  constructor(private http: HttpClient) { }

  private handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error.message);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong,
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    // return an observable with a user-facing error message
    return throwError(
      'Something bad happened; please try again later.');
  };
  public get(url) {
    const urlall = `${this.REST_API_SERVER}/` + url
    return this.http.get(urlall, httpOptions)
      .pipe(
        catchError(this.handleError)
      );
  }
  public post(url, data) {
    const urlall = `${this.REST_API_SERVER}/` + url
    return this.http.post(urlall, data, httpOptions)
      .pipe(
        catchError(this.handleError)
      );
  }
}
