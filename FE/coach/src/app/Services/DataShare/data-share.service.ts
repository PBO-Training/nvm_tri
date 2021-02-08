import { Injectable } from '@angular/core';
import { BehaviorSubject, Subject } from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class DataShareService {
  private dataTicketOneWayBS = new BehaviorSubject({});
  private dataTicketRoundWayBS = new BehaviorSubject({});
  private dataCustomerBS = new BehaviorSubject({});
  public dataNav = new Subject();

  currentDataTicketOneWayBS = this.dataTicketOneWayBS.asObservable();
  currentDataTicketRoundWayBS = this.dataTicketRoundWayBS.asObservable();
  currentDataCustomerBS = this.dataCustomerBS.asObservable();

  changeDataTicketOneWayBS(data: any) {
    this.dataTicketOneWayBS.next(data);
  }
  changeDataTicketRoundWayBS(data: any) {
    this.dataTicketRoundWayBS.next(data);
  }

  changeDataCustomerBS(data: any) {
    this.dataCustomerBS.next(data);
  }
  senddata() {
    this.dataNav.next(0);
  }
  constructor() { }
}
