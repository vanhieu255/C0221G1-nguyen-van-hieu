package bai_tap.Sanpham;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {

    private int id ;
    private String nameProduct;
    private String nameCompany;
    private int price;

    public Product() {
    }

    public Product(int id, String nameProduct, String nameCompany, int price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.nameCompany = nameCompany;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", nameCompany='" + nameCompany + '\'' +
                ", price=" + price +
                '}';
    }
    public void add(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap id :");
        id=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap namProduct :");
        nameProduct=sc.nextLine();
        System.out.println("Nhap nameCompany :");
        nameCompany=sc.nextLine();
        System.out.println("Nhap price:");
        price=Integer.parseInt(sc.nextLine());

    }
    public void hienThi(){
        System.out.println(toString());
    }

}
