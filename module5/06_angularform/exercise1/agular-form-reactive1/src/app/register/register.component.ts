import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from '@angular/forms';
import {comparePassword} from '../gte.validator';
import validate = WebAssembly.validate;

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  countryList = [
    {id: 1 , name: 'Đà nẵng'},
    {id: 2 , name: 'Huế'},
    {id: 3 , name: 'Sài Gòn'},
    {id: 4 , name: 'Hà Nội'},
  ];
  registerForm = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.minLength(6)]),
    pwGroup: new FormGroup({
      password: new FormControl('', [Validators.required, Validators.minLength(6)]),
      confirmPassword: new FormControl('',[Validators.pattern()])}),
    country: new FormControl('', [Validators.required]),
    age : new FormControl('', [Validators.required, Validators.min(18)]),
    gender: new FormControl('', [Validators.required]),
    phone: new FormControl('', [Validators.required, Validators.pattern(/^\+84\d{9,10}$/)]),
  });
  constructor() {
  }

  ngOnInit(): void {

  }
  get email() {
    return this.registerForm.get('email');
  }
  get password() {
    return this.registerForm.get('password');
  }

  get confirmPassword() {
    return this.registerForm.get('confirmPassword');
  }
  get country() {
    return this.registerForm.get('country');
  }
  get age() {
    return this.registerForm.get('age');
  }
  get gender() {
    return this.registerForm.get('country');
  }
  get phone() {
    return this.registerForm.get('phone');
  }



  onSubmit() {
    console.log(this.registerForm);
  }
}
