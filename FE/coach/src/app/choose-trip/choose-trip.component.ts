import { Component, OnInit, ElementRef } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
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
  request: any;
  carValue: number;
  constructor(private Route: ActivatedRoute, private connectApi: ConnectApiService, private ElementAngular: ElementRef, private DataShare : DataShareService) {

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
      this.carValue = this.dataTrip[0].carID;
    });

  }
  public changeCar(idCar) {
    console.log(this.ElementAngular);
    console.log('idCar', idCar);
  }
  submitData(data) {
    console.log(data);
    this.DataShare.setDataTrip(data);
  }
  goInfo()
  {

  }
}

