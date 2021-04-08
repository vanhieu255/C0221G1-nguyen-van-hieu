package bai_tap_4;

import java.util.Scanner;

public class TextTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap collor :");
        String collor =sc.nextLine();
        System.out.println("nhap filled");
        boolean filled=sc.nextBoolean();
        System.out.println("nhap side 1");
        double side1 =sc.nextDouble();
        System.out.println("nhap side 2");
        double side2 =sc.nextDouble();
        System.out.println("nhap side 3");
        double side3 =sc.nextDouble();
        Triangle triangle=new Triangle(collor,filled,side1,side2,side3);
        System.out.println("dien tich ="+triangle.getArea());
        System.out.println("chu vi ="+triangle.getPerimeter());
        System.out.println(triangle.toString());


    }
}
