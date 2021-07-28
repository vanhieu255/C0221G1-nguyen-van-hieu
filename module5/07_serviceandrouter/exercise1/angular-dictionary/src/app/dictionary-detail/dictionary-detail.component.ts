import { Component, OnInit } from '@angular/core';
import {Iword} from '../iword';
import {DictionaryService} from '../dictionary.service';
import {ActivatedRoute, ParamMap} from '@angular/router';

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {
  dictionary: Iword ;
  word: string;
  constructor(private dictionaryService: DictionaryService, private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.word = paramMap.get('word');
      this.dictionary = this.findByWord(this.word);

    });
  }

  ngOnInit(): void {
  }

  private findByWord(word: string) {
   return this.dictionaryService.findByWord(word);

  }
}
