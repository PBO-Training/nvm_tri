import { NodeWithI18n } from '@angular/compiler';
import { EventEmitter, Component, Input, OnInit, OnChanges, SimpleChanges, Output } from '@angular/core';
import { Trip } from '../entity/trip';


@Component({
  selector: 'app-seat',
  templateUrl: './seat.component.html',
  styleUrls: ['./seat.component.scss']
})
export class SeatComponent implements OnInit, OnChanges {

  @Input() dataTrip: Trip[];
  @Input() idCar: number;
  @Output() dataSeatCar = new EventEmitter();
  seats: string[] = [];
  dataTripTemp: Trip;
  chooseSeats: string[] = [];
  totalPrice: number = 0;
  dataSeat: Object;
  constructor() {

  }
  ngOnChanges(changes: SimpleChanges): void {

    if ('dataTrip' in changes) {
      this.dataTrip = changes['dataTrip'].currentValue;
    }
    if ('idCar' in changes) {
      this.chooseSeats = [];
      this.totalPrice = 0;
      this.idCar = changes['idCar'].currentValue;
      this.changeSeat(this.idCar);
    }
  }
  public chooseSeat(even, idx) {
    console.log(even.target.checked)
    if (even.target.checked === true) {
      this.chooseSeats.push(idx)
    } else {
      this.chooseSeats = this.chooseSeats.filter(data => data !== idx)
    }
    this.totalPrice = (this.dataTripTemp.carPrice + this.dataTripTemp.routePrice) * this.chooseSeats.length;
    this.dataSeat =
    {
      seats: this.chooseSeats,
      price: this.totalPrice,
      amout: this.chooseSeats.length,
      codeTicket: this.dataTripTemp.carCode + this.chooseSeats.join(''),
      provinceStart: this.dataTripTemp.provinceStartName,
      provinceEnd: this.dataTripTemp.provinceEndName,
      licensePlates: this.dataTripTemp.licensePlates,
      departureTime: this.dataTripTemp.departureTime,
      dateTrip: this.dataTripTemp.date,
      tripID:this.dataTripTemp.tripID

    };
    this.dataSeatCar.emit(this.dataSeat);
  }
  ngOnInit(): void {
    console.log(this.idCar)
  }
  public changeSeat(idCar) {
    this.seats = [];

    this.dataTrip.filter(data => {
      if (data.carID === idCar) {
        for (let i = 1; i <= data.carAmount; i++) {
          if (i < 10) {
            const seat = 'A0' + i;
            this.seats.push(seat);
          }else
          {
            const seat = 'A' + i;
            this.seats.push(seat);
          }

        }
        this.dataTripTemp = { ...data };
      }
    });

  }
}
