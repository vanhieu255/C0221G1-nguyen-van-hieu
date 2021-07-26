import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student-info',
  templateUrl: './student-info.component.html',
  styleUrls: ['./student-info.component.css']
})
export class StudentInfoComponent implements OnInit {
  student = {id: 5, name: "hieu"};
  colorText = "red";

  constructor() { }

  ngOnInit(): void {
  }
  changNameStudent(event: any) {
    this.student.name = event;
  }

}
