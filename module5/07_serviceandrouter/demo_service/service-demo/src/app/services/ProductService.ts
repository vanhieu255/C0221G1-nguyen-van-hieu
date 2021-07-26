import {Product} from '../model/Product';

export class ProductService {
  public getProduct() {
    let products: Product[];

    products = [
      new Product(1,'Money card',500),
      new Product(2,'Pen Driver',600),
      new Product(3,'Power Bank',700),
    ];
    return products;
  }
}
