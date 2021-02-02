import { Component, OnInit, ElementRef } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';

import { ConnectApiService } from '../Services/Web/connect-api.service';
import { faArrowRight } from '@fortawesome/free-solid-svg-icons';
import { Trip } from '../entity/trip';
import { Car } from '../entity/car';
import { count } from 'rxjs/operators';
import { DataShareService } from '../Services/DataShare/data-share.service';
@Component({
  selector: 'app-choose-trip',
  templateUrl: './choose-trip.component.html',
  styleUrls: ['./choose-trip.component.scss']
})
export class ChooseTripComponent implements OnInit {
  faChevronRight = faArrowRight;
  dataTrip: Trip[];
  requestOneWay: any;
  requestRoundWay: any;
  carValue: number;
  seatChooseDisabled: string[] = [];
  dataTicket: any;
  // tslint:disable-next-line: max-line-length
  constructor(private Route: ActivatedRoute, private connectApi: ConnectApiService, private ElementAngular: ElementRef, private DataShare: DataShareService, private _route: Router) {
    console.log(this.requestRoundWay)
    const datesplit = this.Route.snapshot.paramMap.get('dateOneWay').split('-');

    const month = parseInt(datesplit[1], 10) > 9 ? datesplit[1] : '0' + datesplit[1];
    const day = parseInt(datesplit[2], 10) > 9 ? datesplit[2] : '0' + datesplit[2];
    const dateOneWay = [datesplit[0], month, day].join('-');
    this.Route.paramMap.subscribe(params => {
      this.requestOneWay = {
        routeID: params.get('routeID'),
        date: dateOneWay
      };
      // if ((params.get('dateRoundWay') !== null)) {
      //   const datesplit = this.Route.snapshot.paramMap.get('dateRoundWay').split('-');

      //   const month = parseInt(datesplit[1], 10) > 9 ? datesplit[1] : '0' + datesplit[1];
      //   const day = parseInt(datesplit[2], 10) > 9 ? datesplit[2] : '0' + datesplit[2];
      //   const dateRoundWay = [datesplit[0], month, day].join('-');
      //   this.requestRoundWay =
      //   {
      //     routeID: params.get('routeID'),
      //     date: dateRoundWay
      //   }
      // }


    });
  }
  ngOnInit(): void {
    console.log(this.requestRoundWay)
    this.dataTrip = [];
    this.connectApi.post('trip/gettrip', this.requestOneWay).subscribe((response) => {
      this.dataTrip = response['content'];
      console.log(this.dataTrip);
      this.carValue = this.dataTrip[0].carID;
    });
    // if ((this.requestRoundWay !== null)) {
    //   this.connectApi.post('trip/gettrip', this.requestRoundWay).subscribe((response) => {
    //     this.dataTrip.push(response['content']);
    //     console.log(this.dataTrip);
    //     this.carValue = this.dataTrip[0].carID;
    //   });
    // }

  }
  public changeCar(idCar) {
    console.log(this.ElementAngular);
    console.log('idCar', idCar);
  }
  submitData(data) {
    console.log(data);
    this.dataTicket = data;
    this.DataShare.setDataTrip(data);
  }
  goInfo() {

    this.seatChooseDisabled = this.DataShare.getDataTrip()['seats']
    console.log(this.seatChooseDisabled)
    this.DataShare.changeDataTicketBS(this.dataTicket);
    console.log(this.dataTicket);
  }
  goBack() {
    window.history.back();

  }
}

