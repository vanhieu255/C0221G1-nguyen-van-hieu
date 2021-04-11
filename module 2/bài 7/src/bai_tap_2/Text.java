package bai_tap_2;


import bai_tap.kethua2.*;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap radius =");
        double radius=sc.nextDouble();
        System.out.println("nhap width =");
        double width=sc.nextDouble();
        System.out.println("nhap height =");
        double height=sc.nextDouble();



        Shape[] arr=new Shape[3];
        arr[0]=new Circle(radius);;
        arr[1]=new Rectangle(width,height);
        arr[2]=new Square(width);

        for (Shape i : arr) {
            if(i instanceof Circle){
                System.out.println(+((Circle) i).getArea());
            }else if(i instanceof Rectangle){
                System.out.println(((Rectangle) i).getArea());
                if(i instanceof Square){
                System.out.println(((Square) i).howToColor());

                }
            }
        }

    }
}
