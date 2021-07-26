import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-rating-bar-component',
  templateUrl: './rating-bar-component.component.html',
  styleUrls: ['./rating-bar-component.component.css']
})
export class RatingBarComponentComponent implements OnInit {
  @Input()
  point: number;

  constructor() { }

  ngOnInit(): void {
  }

}
