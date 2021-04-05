package thuc_hanh;

import java.awt.*;
import java.util.Scanner;

public class LopHinhChuNhat {

        double width, height;

        public LopHinhChuNhat() {

        }

        public LopHinhChuNhat(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return this.width * this.height;
        }

        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }

        public String display() {
            return "LopHinhChuNhat {" + "width =" + width + ",height=" + height + "}";
        }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = sc.nextDouble();
        System.out.print("Enter the height:");
        double height = sc.nextDouble();

        LopHinhChuNhat rectangle = new LopHinhChuNhat(width,height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());


    }


}



