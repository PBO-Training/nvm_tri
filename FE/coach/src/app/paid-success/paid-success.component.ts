import { Component, OnInit } from '@angular/core';
import { DataShareService } from '../Services/DataShare/data-share.service';
import { faArrowRight } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-paid-success',
  templateUrl: './paid-success.component.html',
  styleUrls: ['./paid-success.component.scss']
})
export class PaidSuccessComponent implements OnInit {
  faArrowRight = faArrowRight;
  dataTicket: any;
  dataCustomer: any;
  constructor(private DataShare: DataShareService) {
    this.dataTicket = DataShare.getDataTrip();
    this.dataCustomer = DataShare.getdataUser();
  }

  ngOnInit(): void {
    this.DataShare.currentDataCustomerBS.subscribe(data => this.dataCustomer = data);
    this.DataShare.currentDataTicketBS.subscribe(data => this.dataTicket = data);
    console.log('constructor ~ this.dataTicket', this.dataTicket)
    console.log('constructor ~ this.dataCustomer', this.dataCustomer)
  }
  goBack() {
    window.history.back();
  }
  goPaid() {

  }
}
