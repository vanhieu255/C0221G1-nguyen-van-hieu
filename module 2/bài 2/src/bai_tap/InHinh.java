package bai_tap;

import java.util.Scanner;

public class InHinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<7;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }

        for( i=1; i<=5; i++){
            for( j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }





        for( i=7;i>=1;i--){
            for( j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //thiếu tam giác cân



    }
}
