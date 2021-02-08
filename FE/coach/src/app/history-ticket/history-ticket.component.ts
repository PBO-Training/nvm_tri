import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { faCalendarAlt } from '@fortawesome/free-solid-svg-icons';
import { NgSelectComponent } from '@ng-select/ng-select';
import { ConnectApiService } from '../Services/Web/connect-api.service';
import { FullTicket } from '../entity/ticket'

@Component({
  selector: 'app-history-ticket',
  templateUrl: './history-ticket.component.html',
  styleUrls: ['./history-ticket.component.scss']
})
export class HistoryTicketComponent implements OnInit {
  @ViewChild('NgSelectComponent') ngSelectComponent: NgSelectComponent;
  objectKeys = Object.keys;
  faCalendar = faCalendarAlt;
  searchTicket: FormGroup;
  action = {
    info : true,
    update:true,
    delete:true
  }
  dataTable: FullTicket[]
  columHeader =
    {
      ticketCode: 'Mã vé',
      dateBuyTicket: 'Ngày mua',
      dateGo: 'Ngày đi',
      route: 'Tuyến đường',
      amountSeats: 'Số lượng',
      seat: 'Vị trí ghế',
      price: 'Tổng tiền',
      status: 'Trạng thái'
    };

  constructor(private fb: FormBuilder, private connectApi: ConnectApiService) {
    this.searchTicket = fb.group(
      {
        ticketCode: [null],
        dateBuyTicket: [null],
        dateGo: [null],
        provinceStart: [null],
        provinceEnd: [null],
        status: [null]
      }
    )
  }

  ngOnInit(): void {
    this.connectApi.post("ticket/getticket", this.searchTicket.value).subscribe((response) => {
      console.log(response);
      this.dataTable = response['content'];
    })
  }

}
