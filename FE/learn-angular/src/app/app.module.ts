import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HelloComponent} from "./hello.component";
import { FormsModule, ReactiveFormsModule} from "@angular/forms"
import { ProcessBarComponent } from './process-bar/process-bar.component';
import { AuthorListComponent } from './author-list/author-list.component';
import { AuthorDetailComponent } from './author-detail/author-detail.component';
import { ToggleComponent } from './toggle/toggle.component';
@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    ProcessBarComponent,
    AuthorListComponent,
    AuthorDetailComponent,
    ToggleComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
