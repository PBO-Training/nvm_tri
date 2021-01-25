import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import {Author} from '../authors';
@Component({
  selector: 'app-author-detail',
  templateUrl: './author-detail.component.html',
  styleUrls: ['./author-detail.component.scss']
})
export class AuthorDetailComponent implements OnInit {
@Input() author : Author;
@Output() deleteAuthor = new EventEmitter();
  constructor() { }

  ngOnInit(): void {console.log("ád")
  }
  handleDelete() {
    this.deleteAuthor.emit(this.author);
  }
}
