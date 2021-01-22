import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import {NgSelectModule, NgOption, NgSelectConfig} from '@ng-select/ng-select';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {


  constructor() { }

  formSearhRoute = new FormGroup(
    {
      oneWay: new FormControl(''),
      twoWay: new FormControl('')
    }
  )

  selectedCar: number;

  cars = [
      { id: 1, name: 'Volvo' },
      { id: 2, name: 'Saab' },
      { id: 3, name: 'Opel' },
      { id: 4, name: 'Audi' },
  ];
  ngOnInit(): void {
  }

}
