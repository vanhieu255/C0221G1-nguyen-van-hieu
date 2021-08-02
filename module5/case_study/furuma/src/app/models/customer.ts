import {CustomerType} from './customer-type';

export interface Customer {
  id?: number;
  customerType?: CustomerType;
  hoTen?: string;
  ngaySinh?: string;
  soCMND?: string;
  sdt?: string;
  email?: string;
  diaChi?: string;
}
