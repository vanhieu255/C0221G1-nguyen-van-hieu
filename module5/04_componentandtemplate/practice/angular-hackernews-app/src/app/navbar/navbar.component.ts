import { Component, OnInit } from '@angular/core';

class urlText {
url: string;
}

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  text: urlText[] = [{url: "abc"} , {url: "xyz"}];

  constructor() { }

  ngOnInit(): void {
  }

}
