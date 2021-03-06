import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ChooseTripComponent } from './choose-trip/choose-trip.component';
import { HistoryTicketComponent } from './history-ticket/history-ticket.component';
import { InfoCustomerComponent } from './info-customer/info-customer.component';
import { InfoTicketComponent } from './info-ticket/info-ticket.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { PaidSuccessComponent } from './paid-success/paid-success.component';
import { SearchRouteComponent } from './search-route/search-route.component';


const routes: Routes = [
  {
    path: 'trip',
    component: ChooseTripComponent,
  },
  {
    path: '',
    component: SearchRouteComponent,
  },
  {
    path: 'infocustomer',
    component: InfoCustomerComponent
  },
  {
    path: 'infoticket',
    component: InfoTicketComponent
  },
  {
    path: 'paidsuccess',
    component: PaidSuccessComponent
  }, {
    path: 'historyticket',
    component: HistoryTicketComponent
  }, {
    path: '**',
    component: NotFoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
