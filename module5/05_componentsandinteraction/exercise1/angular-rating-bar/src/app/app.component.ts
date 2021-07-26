import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-rating-bar';
  pointer: number;
  arrPoint: number[] = [1,2,3,4,5,6,7,8, 9, 10];
  number1: number;
  changPoint(event) {
    this.number1 = this.pointer;
    this.pointer = event.target.value;
  }


  handerHover(event) {
    this.pointer = event.target.value;
  }

  handlerMouseOver($event: MouseEvent) {
    this.pointer = this.number1;
  }
}
