import { Component, EventEmitter, OnInit, Output, ViewChild } from '@angular/core';
import { Province } from '../entity/province';
import { Route } from '../entity/route';
import { ConnectApiService } from '../Services/Web/connect-api.service';
import { NgbDateStruct } from '@ng-bootstrap/ng-bootstrap';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms';
import { NgSelectComponent } from '@ng-select/ng-select';
import { faCalendarAlt } from '@fortawesome/free-solid-svg-icons';
import { Router } from '@angular/router';
import { Subject } from 'rxjs';
import { DataShareService } from '../Services/DataShare/data-share.service';



@Component({
  selector: 'app-search-route',
  templateUrl: './search-route.component.html',
  styleUrls: ['./search-route.component.scss']
})

export class SearchRouteComponent implements OnInit {
  faCalendar = faCalendarAlt;
  @ViewChild('NgSelectComponent') ngSelectComponent: NgSelectComponent;
  @Output() activeNav = new EventEmitter();
  public activeNavigation: any;

  formSearchRoute: FormGroup;
  model: NgbDateStruct;
  isDisable: boolean = false;
  null: null;
  constructor(private connectApi: ConnectApiService, private fb: FormBuilder, public _route: Router, private dataShare: DataShareService) {
    this.formSearchRoute = fb.group(
      {
        provinceStart: this.fb.control(null, [Validators.required]),
        provinceEnd: this.fb.control(null, [Validators.required]),
        dateOneWay: this.fb.control(null, [Validators.required]),
        dateRoundWay: this.fb.control({ value: null, disabled: true }),
        way: this.fb.control('oneWay', [Validators.required]),


      }
    );
  }
  provinceStartValue: number;
  provinceEndValue: number;

  public provinceStarts: Province[];
  provinceEnds: Province[];
  route: Route[];
  routeOneWayTemp: Route[];
  routeRoundWayTemp: Route[];
  provinceEndsTemps: Province[] = [];
  routeOneWayID: number;
  routeRoundWayID: number;
  tripRequest: Object
  isDisableRoundWay: boolean = true;


  ngOnInit(): void {

    this.connectApi.get('/province/getall').subscribe((response) => {

      this.provinceStarts = response['content'];


      this.provinceEnds = response['content'];
    });
    this.connectApi.get('/route/getall').subscribe((response) => {
      this.route = response['content'];
    });
    // this.formSearchRoute.controls.provinceEnd.valueChanges.subscribe(val => {
    //   this.formSearchRoute.patchValue({ provinceEnd: null });
    // });
  }
  changeProvinceStart(event) {
    this.isDisableRoundWay = false;
    // this.ngSelectComponent.handleClearClick();
    this.routeOneWayTemp = this.route.filter((item) => item.provinceStart === event);
    this.routeRoundWayTemp = this.route.filter((item) => item.provinceEnd === event);

    this.provinceEndsTemps = [];
    this.formSearchRoute.value.provinceEnd = null;
    this.ngSelectComponent.clearModel();

    this.provinceEnds.filter((item) => this.routeOneWayTemp.forEach(itemRT => {
      if (item.provinceID === itemRT.provinceEnd) {
        this.provinceEndsTemps.push(item);
      }
    }));
  }

  changeProvinceEnd() {
    this.routeOneWayTemp.filter((item) => {
      if (this.formSearchRoute.value.provinceStart === item.provinceStart && this.formSearchRoute.value.provinceEnd === item.provinceEnd) {
        this.routeOneWayID = item.routeID;

      }
    });
    if (this.formSearchRoute.value.way === 'roundWay') {
      this.routeRoundWayTemp.filter((item) => {
        if (this.formSearchRoute.value.provinceEnd === item.provinceStart && this.formSearchRoute.value.provinceStart === item.provinceEnd) {
          this.routeRoundWayID = item.routeID;
        }

      });
    }
  }

  public searRoute() {
    //this.noActiveHomea()
    this.dataShare.senddata();
    this.activeNavigation = "aaaaaaaaaaaa";
    if (this.formSearchRoute.value.way === 'oneWay') {
      this.tripRequest = {
        routeOneWayID: this.routeOneWayID,
        dateOneWay: this.formSearchRoute.value.dateOneWay,
      };
    }
    else {
      this.tripRequest = {
        routeOneWayID: this.routeOneWayID,
        dateOneWay: this.formSearchRoute.value.dateOneWay,
        routeRoundWayID: this.routeRoundWayID,
        dateRoundWay: this.formSearchRoute.value.dateRoundWay
      };
    }

    this._route.navigate(['/trip', this.tripRequest]);

  }

  noActiveHomea() {
    console.log("chưa qua")
    this.activeNav.emit(0)
  }
}
