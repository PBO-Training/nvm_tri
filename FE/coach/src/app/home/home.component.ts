import { Component, OnInit } from '@angular/core';
import { faUser } from '@fortawesome/free-regular-svg-icons';
import { DataShareService } from '../Services/DataShare/data-share.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  faUser = faUser;
  constructor(private dataShare: DataShareService) {

  }


  active = 0;
  title = 'coach';
  activeNavigation: any = 1;
  ngOnInit(): void {
    this.dataShare.dataNav.subscribe((data) => {
      this.activeNavigation = data;
    });
  //}
  }
  public onRouterOutletActivate(event: any) {
    console.log(event);
  }

}
