import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class DataShareService {
  private dataTicketBS = new BehaviorSubject({});
  private dataCustomerBS = new BehaviorSubject({});
  currentDataTicketBS = this.dataTicketBS.asObservable();
  currentDataCustomerBS = this.dataCustomerBS.asObservable();
  private dataTrip;
  private dataUser;
  changeDataTicketBS(data: any) {
    this.dataTicketBS.next(data);
  }

  changeDataCustomerBS(data: any) {
    this.dataCustomerBS.next(data);
  }
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
