import { Component, OnInit } from '@angular/core';
import {Iword} from '../iword';
import {DictionaryService} from '../dictionary.service';

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.css']
})
export class DictionaryPageComponent implements OnInit {
  listDictionary: Iword[] = [];
  word: string;
  mean: string;

  constructor(private dictionaryService: DictionaryService) {

  }

  ngOnInit(): void {
    this.getAll();
  }
  getAll() {
    this.listDictionary = this.dictionaryService.getAll();
  }


  tranlate(word: string): any {
    this.mean = this.dictionaryService.translate(word);
    this.word = word;


  }
}
