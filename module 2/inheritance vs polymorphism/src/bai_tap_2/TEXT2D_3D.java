package bai_tap_2;

import java.util.Arrays;
import java.util.Scanner;

public class TEXT2D_3D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap x=");
       float x=sc.nextFloat();
        System.out.println("nhap y=");
        float y=sc.nextFloat();
        System.out.println("nhap z=");
        float z=sc.nextFloat();
        Point2D point2D=new Point2D(x,y);
        System.out.println("mang 2 thanh phan "+ Arrays.toString(point2D.getXY()));
        System.out.println(point2D.toString());
        Point3D point3D=new Point3D(x,y,z);
        System.out.println("mang 2 thanh phan "+ Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D.toString());
    }
}
