package bai_tap_1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import ke_thua.thuc_hanh.Circle;
import ke_thua.thuc_hanh.Rectangle;
import ke_thua.thuc_hanh.Shape;
import ke_thua.thuc_hanh.Square;

import java.util.Scanner;

public class TextResizeable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double percent=Math.random()*100;
        System.out.println("nhap radius =");
        double radius=sc.nextDouble();
        System.out.println("nhap width =");
        double width=sc.nextDouble();
        System.out.println("nhap height =");
        double height=sc.nextDouble();
        System.out.println("nhap side =");
        double side =sc.nextDouble();
        Circle circle=new Circle(radius);
        circle.resize(percent);
        Rectangle rectangle=new Rectangle(width,height);
        rectangle.resize(percent);
        Square square= new Square(width);
        square.resize(percent);
        System.out.println("DIEN TICH HINH CIRCLE :"+circle.getArea());
        System.out.println("Dien TICH HINH RECTANGLE :"+rectangle.getArea());
        System.out.println("DIEN TICH HINH SQUARE :"+square.getArea());

// van chua the thay doi side o Square

    }
}
