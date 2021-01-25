import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  checked = true;
  formValue = new FormGroup({
    progress: new FormControl('')
  })
  title = 'learn-angular';
  model = {
    name: "ád"
  }
}
