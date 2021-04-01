package thuc_hanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static double CToF(double c){
        double f=(9.0/5)*c+32;
        return f;
    }
    public static double FToC(double f){
        double c=(5.0/9)*(f-32);
        return c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double f,c;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Input F:");
                    f=sc.nextDouble();
                    c=FToC(f);
                    System.out.println("c="+c);
                    break;
                case 2 :
                    System.out.println("Input C:");
                    c=sc.nextDouble();
                    f=CToF(c);
                    System.out.println("c="+c);
                    break;
                case 0:
                    System.exit(0);

            }

        }while (true);
    }
}
