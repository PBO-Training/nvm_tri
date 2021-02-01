import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ChooseTripComponent } from './choose-trip/choose-trip.component';
import { InfoCustomerComponent } from './info-customer/info-customer.component';
import { SearchRouteComponent } from './search-route/search-route.component';


const routes: Routes = [
  {
    path: "trip",
    component: ChooseTripComponent,
  },
  {
    path: "",
    component: SearchRouteComponent,
  },
  {
    path: "infocustomer",
    component: InfoCustomerComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
