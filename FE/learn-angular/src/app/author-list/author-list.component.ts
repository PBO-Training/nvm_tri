import { Component, OnInit } from '@angular/core';
import { Author } from '../authors';

@Component({
  selector: 'app-author-list',
  templateUrl: './author-list.component.html',
  styleUrls: ['./author-list.component.scss']
})
export class AuthorListComponent implements OnInit {

  authors: Author[];
  constructor() {
    this.authors = [{
      id: 1,
      firstName: "Minh Trí",
      lastName: "Nguyễn Văn",
      email: "tri72027@gmail.com",
      gender: "Female",
      ipAddress: "string"
    }, {
      id: 2,
      firstName: "Tân An",
      lastName: "Nguyễn Xuân",
      email: "nxt_a@gmail.com",
      gender: "Women",
      ipAddress: "string1"
    }
    ]
  }
  handleDeleteA(author : Author) {
    console.log(author)
    this.authors = this.authors.filter((item , idx)=>item.id !==author.id  )
  }
  ngOnInit(): void {
  }

}
