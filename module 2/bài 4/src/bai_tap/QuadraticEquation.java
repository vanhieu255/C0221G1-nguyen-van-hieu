package bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = (this.b * this.b - 4 * this.a * this.c);
        return delta;
    }

    public double getRoot1() {
        double r1 = (-this.b + Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / (2 * this.a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-this.b - Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / (2 * this.a);
        return r2;
    }

    public double getRoot0() {
        double r0 = -this.b / (2 * this.a);
        return r0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input A");
        double a = sc.nextDouble();
        System.out.println("Input B");
        double b = sc.nextDouble();
        System.out.println("Input C");
        double c = sc.nextDouble();
        QuadraticEquation s = new QuadraticEquation(a, b, c);

        if (s.getA() == 0) {
            if (s.getB() == 0) {
                System.out.println("phương trinh vo nghiem");
            } else {
                System.out.println("phuong trình có  1 nghiệm " + (-s.getC()) / (s.getB()));
            }
        } else {
            System.out.println("delta=" + s.getDiscriminant());
            if (s.getDiscriminant() > 0) {
                System.out.println("phương trình có 2 nghiêm :\n" + "x1 = " + s.getRoot1() + "; " + "x2 =" + s.getRoot2());
            } else if (s.getDiscriminant() == 0) {
                System.out.println("phuong trinh co nghiem kep x1=x2=" + s.getRoot0());
            } else {
                System.out.println("phuong trinh vô nghiêm");
            }

        }

    }
}
