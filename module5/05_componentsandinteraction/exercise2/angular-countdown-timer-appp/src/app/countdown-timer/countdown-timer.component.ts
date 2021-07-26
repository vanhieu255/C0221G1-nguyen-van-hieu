import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-countdown-timer',
  templateUrl: './countdown-timer.component.html',
  styleUrls: ['./countdown-timer.component.css']
})
export class CountdownTimerComponent implements OnInit {

  @Input()
  count: number;
  @Input()
  dem: number;


  message = '';
  interval: any;

  constructor() {
  }

  ngOnInit(): void {
  }
  start() {
    this.interval = setInterval(() => {
      this.count--;
      if (this.count === 0) {
        this.message = 'happy new year';
        clearInterval(this.interval);
      }
    }, 1000);
  }

  stop() {
    clearInterval(this.interval);
  }

  reset() {
    this.count = this.dem;
    this.message = '';

  }
}
