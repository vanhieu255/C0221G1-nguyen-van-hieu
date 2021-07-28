import { Injectable } from '@angular/core';
import {Iword} from './iword';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  listDictionary: Iword[] = [
    {
      word: 'hello', mean: 'xin chào'
    },
    {
      word: 'How are you?', mean: 'Bạn có khỏe không'
    },
    {
      word: 'fast', mean: 'nhanh'
    },
    {
      word: 'slowly', mean: 'chậm'
    }, {
      word: 'goodbye', mean: 'tạm biệt'
    },
  ];

  constructor() {
  }

  translate(word: string): string {
    if (!word) {
      return '';
    }
    const w = this.listDictionary.find(item => item.word === word.toLowerCase());
    if (w) {
      return w.mean;
    }
    return 'Not found';
  }

  getAll() {
    return this.listDictionary;
  }

  findByWord(word: string) {
    // return this.listDictionary.find(dictionary => dictionary.word === word);
    for (let dictionary of this.listDictionary) {
      if (dictionary.word === word) {
        return dictionary;
        break;
      }
    }
    return null;
  }
}
