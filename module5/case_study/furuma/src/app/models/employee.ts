import {Education} from "./education";
import {Position} from "./position";
import {Division} from "./division";

export interface Employee {
  id?: number;
  hoTen?: string;
  education?: Education;
  position?: Position;
  division?: Division;
  ngaySinh?: string;
  soCMND?: string;
  luong?: string;
  sdt?: string;
  email?: string;
  diaChi?: string;
}
