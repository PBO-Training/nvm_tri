import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataShareService {
  private dataTrip;
  private dataUser;

  getDataTrip() {
    return this.dataTrip;
  }
  setDataTrip(data) {
    this.dataTrip = data;
  }
  getdataUser() {
    return this.dataUser;
  }
  setdataUser(data) {
    this.dataUser = data;
  }
  constructor() { }
}
