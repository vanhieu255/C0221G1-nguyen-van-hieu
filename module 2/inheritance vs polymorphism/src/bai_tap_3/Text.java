package bai_tap_3;

import java.util.Arrays;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap x=");
        float x=sc.nextFloat();
        System.out.println("nhap y=");
        float y=sc.nextFloat();
        System.out.println("nhap xSpeed=");
        float xSpeed=sc.nextFloat();
        System.out.println("nhap ySpeed=");
        float ySpeed=sc.nextFloat();
        Point point=new Point(x,y);
        System.out.println("thành phan mang :"+ Arrays.toString(point.getXY()));
        System.out.println(point.toString());
        MovablePoint movablePoint=new MovablePoint(x,y,xSpeed,ySpeed);
        System.out.println("thanh phan mang 2:"+ Arrays.toString(movablePoint.move()));
        System.out.println(movablePoint.toString());



    }
}
