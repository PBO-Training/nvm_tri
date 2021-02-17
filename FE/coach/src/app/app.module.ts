import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { NgSelectModule } from '@ng-select/ng-select';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { NgbModule, NgbDateAdapter, NgbDateParserFormatter } from '@ng-bootstrap/ng-bootstrap';
import { SearchRouteComponent } from './search-route/search-route.component';

import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { CustomAdapter, CustomDateParserFormatter } from './common/datepicker-adapter';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { ChooseTripComponent } from './choose-trip/choose-trip.component';
import { SeatComponent } from './seat/seat.component';
import { InfoCustomerComponent } from './info-customer/info-customer.component';
import { InfoTicketComponent } from './info-ticket/info-ticket.component';
import { PaidSuccessComponent } from './paid-success/paid-success.component';
import { HistoryTicketComponent } from './history-ticket/history-ticket.component';
import { TableComponent } from './table/table.component';
import { HomeComponent } from './home/home.component';
import { MaintenanceSystemComponent } from './Modal/MaintenanceSystem/maintenance-system/maintenance-system.component';
import { NotFoundComponent } from './not-found/not-found.component';

@NgModule({
  declarations: [AppComponent,
     SearchRouteComponent,
     ChooseTripComponent,
     SeatComponent,
     InfoCustomerComponent,
     InfoTicketComponent,
     PaidSuccessComponent,
     HistoryTicketComponent,
     TableComponent,
     HomeComponent,
     MaintenanceSystemComponent,
     NotFoundComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    NgSelectModule,
    FormsModule,
    HttpClientModule,
    CommonModule,
    ReactiveFormsModule,
    FontAwesomeModule

  ],
  providers: [{ provide: NgbDateAdapter, useClass: CustomAdapter },
  { provide: NgbDateParserFormatter, useClass: CustomDateParserFormatter },SearchRouteComponent],
  bootstrap: [AppComponent],
})
export class AppModule { }
