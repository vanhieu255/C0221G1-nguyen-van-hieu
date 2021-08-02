import { Component, OnInit } from '@angular/core';
import { Student } from '../model/student';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  config: any;

  arrayOfStudent: Student[] = [
  new Student(1,'hieu',"9-10-1995",9 ),
  new Student(2,'tung',"9-11-1995",7 ),
  new Student(3,'hậu',"9-12-1995",8 ),
  new Student(4,'hoàng',"9-1-1995",10 )

];
  constructor() {
    this.config = {
      itemsPerPage: 2,
      currentPage: 1,
      totalItems: this.arrayOfStudent.length
  };
  }
  public maxSize: number = 7;
  public directionLinks: boolean = true;
  public autoHide: boolean = false;
  public responsive: boolean = true;
  public labels: any = {
    previousLabel: '<--',
    nextLabel: '-->',
    screenReaderPaginationLabel: 'Pagination',
    screenReaderPageLabel: 'page',
    screenReaderCurrentLabel: `You're on page`
  };

  ngOnInit(): void {
  }

  onPageChange(event) {
    console.log(event);
    this.config.currentPage = event;
  }

}
