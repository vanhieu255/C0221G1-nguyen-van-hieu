package bai_tap;

import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input rate");
        float rate=sc.nextFloat();
        System.out.println("Input Money USD");
        float moneyUSD=sc.nextFloat();
        float moneyVND=moneyUSD*rate;
        System.out.printf("Money VNĐ = %f",moneyVND);


    }
}

