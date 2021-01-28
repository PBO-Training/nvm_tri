import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { ConnectApiService } from '../Services/Web/connect-api.service';

@Component({
  selector: 'app-choose-trip',
  templateUrl: './choose-trip.component.html',
  styleUrls: ['./choose-trip.component.scss']
})
export class ChooseTripComponent implements OnInit {
  request
  state$: Observable<object>;

  constructor(private _route: ActivatedRoute, private connectApi: ConnectApiService) {
    const datesplit = this._route.snapshot.paramMap.get('date').split("-")

    const month = parseInt(datesplit[1]) > 9 ? datesplit[1] : "0" + datesplit[1];
    const day = parseInt(datesplit[2]) > 9 ? datesplit[2] : "0" + datesplit[2];
    const date = [datesplit[0], month, day].join("-")
    this._route.paramMap.subscribe(params => {
      this.request = {
        routeID: params.get('routeID'),
        date: date
      };

    })
  }

  ngOnInit(): void {
    this.connectApi.post('trip/gettrip', this.request).subscribe((response) => {

      console.log(response)
    });
    // this.request = {

    //   routeID: this._route.snapshot.paramMap.get('routeID'),
    //   date: this._route.snapshot.paramMap.get('date')
    // };
    // console.log('ngOnInit ~ request', this.request)



  }

}

