import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ChooseTripComponent } from './choose-trip/choose-trip.component';
import { SearchRouteComponent } from './search-route/search-route.component';


const routes: Routes = [
  {
    path: "trip",
    component: ChooseTripComponent,
  },
  {
    path: "",
    component: SearchRouteComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
