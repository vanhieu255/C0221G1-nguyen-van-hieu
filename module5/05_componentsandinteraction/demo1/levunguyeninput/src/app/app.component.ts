import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'levunguyeninput';
   Counter = 5;

  increment() {
    this.Counter++;

  }

  decrement() {
    this.Counter--;

  }
}
