import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-info-customer',
  templateUrl: './info-customer.component.html',
  styleUrls: ['./info-customer.component.scss']
})
export class InfoCustomerComponent implements OnInit {
  infoCusomer: FormGroup;
  constructor(private fb: FormBuilder) {

    this.infoCusomer = fb.group({
      fullName: [null, Validators.required],
      phone: [null, Validators.required],
      email: [null, Validators.required],
      identificationNumber: [null, Validators.required, Validators.minLength(9), Validators.maxLength(12)],
      accept: [null, Validators.required]
    });

  }
  ngOnInit(): void {

  }
test(even)
{
console.log('even', even)

}

}
