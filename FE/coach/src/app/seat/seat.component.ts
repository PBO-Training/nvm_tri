import { NodeWithI18n } from '@angular/compiler';
import { EventEmitter, Component, Input, OnInit, OnChanges, SimpleChanges, Output } from '@angular/core';
import { Trip } from '../entity/trip';
import { Ticket } from '../entity/ticket';
import { ConnectApiService } from '../Services/Web/connect-api.service';


@Component({
  selector: 'app-seat',
  templateUrl: './seat.component.html',
  styleUrls: ['./seat.component.scss']
})
export class SeatComponent implements OnInit, OnChanges {

  @Input() dataTrip: Trip[];
  @Input() carValueOneWay: number;
  @Input() carValueRoundWay: number;
  @Output() dataSeatCar = new EventEmitter();

  seats: string[] = [];
  dataTripTemp: Trip;
  chooseSeats: string[] = [];
  seatsDisable: string[] = [];
  totalPrice: number = 0;
  dataSeat: Object;
  OneWay: boolean

  @Input() seatChooseDisabled: string[] = [];
  constructor(private connectApi: ConnectApiService) {

  }
  ngOnChanges(changes: SimpleChanges): void {

    if ('dataTrip' in changes) {
      this.dataTrip = changes['dataTrip'].currentValue;
    }
    if ('seatChooseDisabled' in changes) {
      this.seatChooseDisabled = changes['seatChooseDisabled'].currentValue;
    }
    if ('carValueOneWay' in changes) {
      this.OneWay = false;
      this.chooseSeats = [];
      this.totalPrice = 0;
      this.carValueOneWay = changes['carValueOneWay'].currentValue;
      this.changeSeat(this.carValueOneWay);
    }
    if ('carValueRoundWay' in changes) {
      this.OneWay = true;
      this.chooseSeats = [];
      this.totalPrice = 0;
      this.carValueOneWay = changes['carValueRoundWay'].currentValue;
      this.changeSeat(this.carValueRoundWay);
    }
  }
  public chooseSeat(even, idx) {
    // console.log(even.target.checked)
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
      tripID: this.dataTripTemp.tripID

    };
    this.dataSeatCar.emit(this.dataSeat);
  }
  ngOnInit(): void {


  }
  public changeSeat(idCar) {
    this.seats = [];
    this.dataTrip.filter(data => {
      if (data.carID === idCar) {
        for (let i = 1; i <= data.carAmount; i++) {
          if (i < 10) {
            const seat = 'A0' + i;
            this.seats.push(seat);
          } else {
            const seat = 'A' + i;
            this.seats.push(seat);
          }
        }
        this.dataTripTemp = { ...data };

        let request = {
          'tripID': this.dataTripTemp.tripID
        };
        this.connectApi.post('ticket/getbytripid', request).subscribe((response) => {
          // console.log(this.dataTripTemp)
          let dataTicket: Ticket[];
          dataTicket = response['content'];

          this.seatsDisable = []
          if (dataTicket !== null) {
            dataTicket.filter(dataT => {
              if (dataT['tripID'] === this.dataTripTemp.tripID) {
                if (this.dataTripTemp.carID === idCar) {

                  // console.log(dataT['seat'].length)
                  if (dataT['seat'].length === 3) {
                    this.seatsDisable.push(dataT['seat']);
                    // console.log(this.chooseSeats)
                  }
                  else {
                    const seatSplit = dataT['seat'].split(',')

                    seatSplit.forEach((data) => {

                      this.seatsDisable.push(data);
                      // console.log(this.chooseSeats)
                    });
                  }

                }
              }
            });
          }
        }

        );
      }
    });

  }
}
