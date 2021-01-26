import { Component, OnInit } from '@angular/core';
import { ConnectApiService } from '../Services/Web/connect-api.service';

@Component({
  selector: 'app-search-route',
  templateUrl: './search-route.component.html',
  styleUrls: ['./search-route.component.scss']
})

export class SearchRouteComponent implements OnInit {

  constructor( private connectApi : ConnectApiService) { }
  provinceStartValue: number;

  provinceStarts  : Object [];
  provinceEnds  : Object;
  route : Object;

  ngOnInit(): void {

  this.connectApi.get("/province/getall").subscribe((response) =>
  {
    
    this.provinceStarts = response['content']
    console.log(this.provinceStarts)

  })
  this.connectApi.get("/route/getall").subscribe((response) =>
  {
    
    this.route = response['content']
    console.log(this.route)

  })
  }
  changeProvinceStart(event)
  {
    console.log(event)
    console.log(this.provinceStartValue)
   
  }
 
}
