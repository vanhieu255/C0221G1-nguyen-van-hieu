export class Student {
  private _id: number;
  private _name: string;
  private _dateOfBirth: string;
  private _point: number;

  constructor(id: number, name: string, dateOfBirth: string, point: number) {
    this._id = id;
    this._name = name;
    this._dateOfBirth = dateOfBirth;
    this._point = point;
  }

  get id(): number {
    return this._id;
  }

  set id(value: number) {
    this._id = value;
  }

  get name(): string {
    return this._name;
  }

  set name(value: string) {
    this._name = value;
  }

  get dateOfBirth(): string {
    return this._dateOfBirth;
  }

  set dateOfBirth(value: string) {
    this._dateOfBirth = value;
  }

  get point(): number {
    return this._point;
  }

  set point(value: number) {
    this._point = value;
  }
}
