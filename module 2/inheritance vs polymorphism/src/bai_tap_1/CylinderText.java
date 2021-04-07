package bai_tap_1;

import java.util.Scanner;

public class CylinderText {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap collor =");
        String collor =sc.nextLine();
        System.out.println("nhap radius =");
        double radius=sc.nextDouble();
        System.out.println("nhap chiều cao h=");
        double h=sc.nextDouble();

        Cylinder cylinder=new Cylinder(radius,collor,h);
        System.out.println("the tich hinh tru ="+cylinder.getAreaH());
        System.out.println(cylinder.toString());

    }
}
