import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

import { DataShareService } from '../Services/DataShare/data-share.service';

@Component({
  selector: 'app-info-customer',
  templateUrl: './info-customer.component.html',
  styleUrls: ['./info-customer.component.scss']
})
export class InfoCustomerComponent implements OnInit {
  infoCusomer: FormGroup;
  constructor(private fb: FormBuilder, private DataShare: DataShareService) {

    this.infoCusomer = fb.group({
      fullName: [null, Validators.required],
      phone: [null, Validators.required],
      email: [null, Validators.required],
      identificationNumber: [null, Validators.required],
      accept: [null, Validators.required]
    });

  }
  ngOnInit(): void {

  }

  goBack() {
    window.history.back();
  }
  goInfoTicket() {

    this.DataShare.changeDataCustomerBS(this.infoCusomer.value)
  }
}
