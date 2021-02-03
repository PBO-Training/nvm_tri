import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class DataShareService {
  private dataTicketOneWayBS = new BehaviorSubject({});
  private dataTicketRoundWayBS = new BehaviorSubject({});
  private dataCustomerBS = new BehaviorSubject({});
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

  constructor() { }
}
