import { Component, OnInit } from '@angular/core';
import { DataShareService } from '../Services/DataShare/data-share.service';
import { faArrowRight } from '@fortawesome/free-solid-svg-icons';
import { ConnectApiService } from '../Services/Web/connect-api.service';
@Component({
  selector: 'app-info-ticket',
  templateUrl: './info-ticket.component.html',
  styleUrls: ['./info-ticket.component.scss']
})
export class InfoTicketComponent implements OnInit {
  faArrowRight = faArrowRight;
  dataTicketOneWay: any;
  dataTicketRoundWay: any;
  dataCustomer: any;
  totalPrice: number;
  constructor(private DataShare: DataShareService, private connectApi: ConnectApiService) {
    console.log(this.dataTicketRoundWay)
    this.DataShare.currentDataCustomerBS.subscribe(data => this.dataCustomer = data);
    this.DataShare.currentDataTicketOneWayBS.subscribe(data => this.dataTicketOneWay = data);
    this.DataShare.currentDataTicketRoundWayBS.subscribe(data => this.dataTicketRoundWay = data);
    console.log(this.dataTicketRoundWay)


  }

  ngOnInit(): void {
    this.totalPrice = this.dataTicketOneWay['price'] + this.dataTicketRoundWay['price'];
  }
  goBack() {
    window.history.back();
  }
  goPaid() {
    console.log(this.dataCustomer)
    const requestTicketOneWay =
    {
      ticketCode: this.dataTicketOneWay['codeTicket'],
      amountSeats: this.dataTicketOneWay['amout'],
      date: new Date(),
      seat: this.dataTicketOneWay['seats'].join(','),
      price: this.dataTicketOneWay['price'],
      tripID: this.dataTicketOneWay['tripID'],
      statusID: 2
    }; this.connectApi.post('ticket/save', requestTicketOneWay).subscribe(data => {
      console.log(data);
    });

    if (this.dataTicketRoundWay['codeTicket']) {
      const requestTicketRoundWay =
      {
        ticketCode: this.dataTicketRoundWay['codeTicket'],
        amountSeats: this.dataTicketRoundWay['amout'],
        date: new Date(),
        seat: this.dataTicketRoundWay['seats'].join(','),
        price: this.dataTicketRoundWay['price'],
        tripID: this.dataTicketRoundWay['tripID'],
        statusID: 2
      };
      this.connectApi.post('ticket/save', requestTicketRoundWay).subscribe(data => {
        console.log(data);
      });
    }
    this.connectApi.post("info/save",this.dataCustomer).subscribe(data =>
      {

      })
  }
}
