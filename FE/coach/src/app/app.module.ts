import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { NgSelectModule } from '@ng-select/ng-select';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { NgbModule , NgbDateAdapter, NgbDateParserFormatter } from '@ng-bootstrap/ng-bootstrap';
import { SearchRouteComponent } from './search-route/search-route.component';

import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { CustomAdapter ,CustomDateParserFormatter} from './common/datepicker-adapter';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { ChooseTripComponent } from './choose-trip/choose-trip.component';

@NgModule({
  declarations: [AppComponent, SearchRouteComponent, ChooseTripComponent],
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
  providers: [  {provide: NgbDateAdapter, useClass: CustomAdapter},
    {provide: NgbDateParserFormatter, useClass: CustomDateParserFormatter}],
  bootstrap: [AppComponent],
})
export class AppModule {}
