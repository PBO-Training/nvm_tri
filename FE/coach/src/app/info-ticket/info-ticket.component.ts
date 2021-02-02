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
  dataTicket: any;
  dataCustomer: any;
  constructor(private DataShare: DataShareService, private connectApi: ConnectApiService) {
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
    let requestTicket =
    {
      ticketCode: this.dataTicket['codeTicket'],
      amountSeats: this.dataTicket['amout'],
      date: new Date(),
      seat: this.dataTicket['seats'].join(','),
      price: this.dataTicket['price'],
      tripID: this.dataTicket['tripID'],
      statusID: 2
    }
    // this.connectApi.post("info/save",this.dataCustomer).subscribe(data =>
    //   {

    //   })
    console.log(requestTicket)
    this.connectApi.post("ticket/save", requestTicket).subscribe(data => {
      console.log(data)
    })

  }
}




