import {Injectable} from '@angular/core';
import {Customer} from '../models/customer';


@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  customers: Customer[] = [
    {
      idKhachHang: 1,
      idLoaiKhach: 1,
      hoTen: 'hiếu',
      ngaySinh: '2000-12-12',
      soCMND: '191875210',
      sdt: '0335448710',
      email: 'hieu@gmail.com',
      diaChi: 'hue'
    },
    {
      idKhachHang: 2,
      idLoaiKhach: 2,
      hoTen: 'hậu',
      ngaySinh: '2000-12-12',
      soCMND: '182547233',
      sdt: '0335448710',
      email: 'hieu@gmail.com',
      diaChi: 'đà nẵng'
    },
    {
      idKhachHang: 3,
      idLoaiKhach: 3,
      hoTen: 'tùng',
      ngaySinh: '2000-12-12',
      soCMND: '146257842',
      sdt: '0335448710',
      email: 'hieu@gmail.com',
      diaChi: 'quảng nam'
    },
    {
      idKhachHang: 4,
      idLoaiKhach: 4,
      hoTen: 'tuấn',
      ngaySinh: '2000-12-12',
      soCMND: '191122354',
      sdt: '0335448710',
      email: 'hieu@gmail.com',
      diaChi: 'quảng trị'
    },
    {
      idKhachHang: 5,
      idLoaiKhach: 1,
      hoTen: 'phú',
      ngaySinh: '2000-12-12',
      soCMND: '191472583',
      sdt: '0335448710',
      email: 'hieu@gmail.com',
      diaChi: 'hue'
    },
    {
      idKhachHang: 6,
      idLoaiKhach: 3,
      hoTen: 'thúy',
      ngaySinh: '2000-12-12',
      soCMND: '185641235',
      sdt: '0335448710',
      email: 'hieu@gmail.com',
      diaChi: 'đà nẵng'
    }
  ];

  constructor() {
  }

  getAll() {
    return this.customers;
  }

  saveCustomer(customer) {
    this.customers.push(customer);
  }
}
