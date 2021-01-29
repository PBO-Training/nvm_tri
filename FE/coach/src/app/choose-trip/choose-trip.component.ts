import { Component, OnInit, ElementRef } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';

import { ConnectApiService } from '../Services/Web/connect-api.service';
import { faArrowRight } from '@fortawesome/free-solid-svg-icons';
import { Trip } from '../entity/trip';
import { Car } from '../entity/car';
import { count } from 'rxjs/operators';
@Component({
  selector: 'app-choose-trip',
  templateUrl: './choose-trip.component.html',
  styleUrls: ['./choose-trip.component.scss']
})
export class ChooseTripComponent implements OnInit {
  faChevronRight = faArrowRight;
  dataTrip: Trip[];
  dataTripTemp: Trip;
  dataCar: Car[];
  request: any;
  carValue: number;
  seats: string[] = [];
  classSeat: string = 'btn btn-success';
  chooseSeats: string[] = [];
  totalPrice: number;
  htmlSeat: string;

  constructor(private Route: ActivatedRoute, private connectApi: ConnectApiService, private ElementAngular: ElementRef) {
    const datesplit = this.Route.snapshot.paramMap.get('date').split('-');

    const month = parseInt(datesplit[1], 10) > 9 ? datesplit[1] : '0' + datesplit[1];
    const day = parseInt(datesplit[2], 10) > 9 ? datesplit[2] : '0' + datesplit[2];
    const date = [datesplit[0], month, day].join('-');
    this.Route.paramMap.subscribe(params => {
      this.request = {
        routeID: params.get('routeID'),
        date: date
      };

    });
  }
  ngOnInit(): void {
    this.connectApi.post('trip/gettrip', this.request).subscribe((response) => {
      this.dataTrip = response['content'];
      console.log(this.dataTrip);

    });
    this.connectApi.get('car/getall').subscribe((response) => {
      console.log(response);
    });
    // this.request = {
    //   routeID: this._route.snapshot.paramMap.get('routeID'),
    //   date: this._route.snapshot.paramMap.get('date')
    // };
    // console.log('ngOnInit ~ request', this.request)
  }
  public changeCar(idCar) {
    this.classSeat = 'btn btn-success';
    this.htmlSeat = '';
   console.log(this.htmlSeat)
    this.htmlSeat = "<button  [class]='btn btn-success' *ngFor='let seat of seats, let idx index' type='seat' [name]='idx'(click)='chooseSeat(idx)'>{{idx}} </button>"

    console.log(this.ElementAngular);
    this.chooseSeats = [];
    this.totalPrice = 0;
    this.seats = [];
    console.log('idCar', idCar);
    this.dataTrip.filter(data => {
      if (data.carID === idCar) {
        for (let i = 1; i <= data.carAmount; i++) {
          const seat = 'A' + i;
          this.seats.push(seat);
          this.dataTripTemp = data;

        }
      }
    });

  }
  public chooseSeat(idx) {


    const attrName = this.ElementAngular.nativeElement.ownerDocument.activeElement.attributes.name.value;

    if (idx === attrName) {
      const classActiveElement = this.ElementAngular.nativeElement.ownerDocument.activeElement.className;
      if (classActiveElement === 'btn btn-success') {
        this.ElementAngular.nativeElement.ownerDocument.activeElement.className = 'btn btn-primary';
        this.chooseSeats.push(attrName);
        console.log(this.chooseSeats);
      }
      else {
        this.ElementAngular.nativeElement.ownerDocument.activeElement.className = 'btn btn-success';
        this.chooseSeats = this.chooseSeats.filter(data => data !== idx)
        console.log(this.chooseSeats);
      }

    }
    this.totalPrice = (this.dataTripTemp.carPrice + this.dataTripTemp.routePrice) * this.chooseSeats.length;
  }
}

