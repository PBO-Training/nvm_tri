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
  dataTripOneWay: Trip[];
  dataTripRoundWay: Trip[];
  requestOneWay: any;
  requestRoundWay: any;
  carValueOneWay: number;
  carValueRoundWay: number;
  seatChooseDisabled: string[] = [];
  dataTicketOneWay: any;
  dataTicketRoundWay: any;

  // tslint:disable-next-line: max-line-length
  constructor(private Route: ActivatedRoute, private connectApi: ConnectApiService, private ElementAngular: ElementRef, private DataShare: DataShareService, private _route: Router) {
    const datesplit = this.Route.snapshot.paramMap.get('dateOneWay').split('-');
    const month = parseInt(datesplit[1], 10) > 9 ? datesplit[1] : '0' + datesplit[1];
    const day = parseInt(datesplit[2], 10) > 9 ? datesplit[2] : '0' + datesplit[2];
    const dateOneWay = [datesplit[0], month, day].join('-');
    this.Route.paramMap.subscribe(params => {
      this.requestOneWay = {
        routeID: params.get('routeOneWayID'),
        date: dateOneWay
      };
      if (this.Route.snapshot.paramMap.get('dateRoundWay') !== null) {
        const datesplit = this.Route.snapshot.paramMap.get('dateRoundWay').split('-');
        const month = parseInt(datesplit[1], 10) > 9 ? datesplit[1] : '0' + datesplit[1];
        const day = parseInt(datesplit[2], 10) > 9 ? datesplit[2] : '0' + datesplit[2];
        const dateRoundWay = [datesplit[0], month, day].join('-');
        this.requestRoundWay =
        {
          routeID: params.get('routeRoundWayID'),
          date: dateRoundWay
        }
      }
    });
  }
  ngOnInit(): void {
    this.connectApi.post('trip/gettrip', this.requestOneWay).subscribe((response) => {
      this.dataTripOneWay = response['content'];
      this.carValueOneWay = this.dataTripOneWay[0].carID;
    });

    this.connectApi.get('chooseseats/getall').subscribe((response) => {
      console.log(response)
      this.dataTripOneWay.filter(data => {
        response['content'].forEach(idx => {
          if (data.carID === idx.carID && data.tripID === idx.tripID) {
            const seats = idx.seats.split(',')
            seats.forEach(element => {
              this.seatChooseDisabled.push(element)
              console.log(this.seatChooseDisabled)
            });
          };
        });

      })
    });
    if (this.requestRoundWay) {
      this.connectApi.post('trip/gettrip', this.requestRoundWay).subscribe((response) => {
        this.dataTripRoundWay = response['content'];
        this.carValueRoundWay = this.dataTripRoundWay[0].carID;
      });
    }

  }
  public changeCar(idCar) {
    console.log(this.ElementAngular);
    console.log('idCar', idCar);
  }
  submitDataOneWay(data) {
    console.log(data);
    this.dataTicketOneWay = data;
    this.seatChooseDisabled = [];
    this.DataShare.changeDataTicketOneWayBS(data);
    this.seatChooseDisabled.push(data.seats);
  }
  submitDataRoundWay(data) {
    console.log(data);
    this.dataTicketRoundWay = data;
    this.DataShare.changeDataTicketRoundWayBS(data);
  }
  goInfo() {
    this.DataShare.currentDataTicketOneWayBS.subscribe(data => this.seatChooseDisabled = data['seats']);
    const dataRequest =
    {
      "tripID": this.dataTicketOneWay['tripID'],
      "carID": this.dataTicketOneWay['carID'],
      "seats": this.dataTicketOneWay['seats'].toString()
    };
    this.connectApi.post("chooseseats/save", dataRequest).subscribe(response => {
      this._route.navigate(['/infocustomer'])
    })
    console.log(this.seatChooseDisabled);
  }
  goBack() {
    window.history.back();

  }
}

