package thuchanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double money=1.0;
        int month=1;
        double interset_rate=1.0;
        System.out.println("Enter investment amount :");
        money=sc.nextDouble();
        System.out.println("Enter number of months: ");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = sc.nextDouble();
        double total=0;
        for(int i=0;i<month;i++){
            total+=money*(interset_rate/100)/12*month;
        }
        System.out.println("total ="+total);
    }

}
