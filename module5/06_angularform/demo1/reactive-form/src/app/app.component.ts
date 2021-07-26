import { Component } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import validate = WebAssembly.validate;

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'reactive-form';
  countryList = [
    {id: 1 , name: 'Đà nẵng'},
    {id: 2 , name: 'Huế'},
    {id: 3 , name: 'Sài Gòn'},
    {id: 4 , name: 'Hà Nội'},
  ];
  contactForm = new FormGroup({firstname: new FormControl('', [Validators.required, Validators.minLength(5)]),
   lastname: new FormControl('', [Validators.required, Validators.maxLength(15)]),
    email: new FormControl('', [Validators.required, Validators.email]),
    gender: new FormControl('', [Validators.required]),
    isMarried: new FormControl('', [Validators.required]),
    country: new FormControl('', [Validators.required]),
      address: new FormGroup({
      city: new FormControl('', [Validators.required]),
      street: new FormControl('', [Validators.required]),
      pincode: new FormControl('', [Validators.required])

    })
  }
  );
  get firstname() {
    return this.contactForm.get('firstname');
  }


  onSubmit() {
    console.log(this.contactForm);

  }
}
