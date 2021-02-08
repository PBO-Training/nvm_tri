import { Component, Input, OnInit } from '@angular/core';
import { faPenAlt, faTrashAlt, faInfo } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.scss']
})
export class TableComponent implements OnInit {
  faPenAlt = faPenAlt;
  faTrashAlt = faTrashAlt;
  faInfo = faInfo;
  @Input() columHeader: any;
  @Input() dataTable: any;
  @Input() isAction: boolean;
  @Input() action: [];
  objectKeys = Object.keys;
  constructor() { }

  ngOnInit(): void {
  }

}
