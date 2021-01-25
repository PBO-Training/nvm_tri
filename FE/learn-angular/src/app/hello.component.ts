import { Component } from "@angular/core";
@Component({
  selector: "app-hello",
  template: ` <h2>Hello Component</h2>
  <h3>You Name: {{user.name}}</h3>
  <p>Your Age: {{user.age}}</p>

  <ng-template [ngIf]="user.age >=13" [ngIfElse] = "noPG13">
<div>
<a> bạn có thể xem nội dung PG13</a>
</div>
</ng-template>
<ng-template #noPG13>
<div>
<a> bạn không thể xem nội dung PG13</a>
</div>
</ng-template>
<!-- dùng *ngFor -->
<div *ngFor="let author of authors;index as idx; count as total">
{{idx}}/{{total}}:{{author.id}} - {{author.firstName}} {{author.lastName}}
</div>
<br>
<!-- dùng ng-template -->
<ng-template ngFor [ngForOf] ="authors"
let-author
let-idx="index"
let-total="count"
>
<div>
{{idx}}/{{total}}:{{author.id}} - {{author.firstName}} {{author.lastName}}
</div>
</ng-template>
  <button (click)="showInfo()">Click ME!</button>
  `,

})
export class HelloComponent {
  user = {
    name: "Trí",
    age: 26
  }

  authors = [
    {
      id: 1,
      firstName: "Flora",
      lastName: "Twell",
      email: "ftwell0@phoca.cz",
      gender: "Female",
      ipAddress: "99.180.237.33",
    },
    {
      id: 2,
      firstName: "Priscella",
      lastName: "Signe",
      email: "psigne1@berkeley.edu",
      gender: "Female",
      ipAddress: "183.243.228.65",
    },
    // more data
  ];
  showInfo() {
    alert("user: " + this.user.name)
  }

}
