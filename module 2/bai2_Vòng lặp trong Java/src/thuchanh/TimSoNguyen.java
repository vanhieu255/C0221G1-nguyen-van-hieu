package thuchanh;

import java.util.Scanner;

public class TimSoNguyen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number");
        int x=sc.nextInt();
        if(x<2){
            System.out.println("không phải là số nguyên tố");
        }else {
            boolean check= true;
            for(int i=2;i<x;i++){
                if(x%i==0){
                    check=false;

                }
            } if(check){
                System.out.println(x+"là số nguyên tố");
            }else {
                System.out.println(x+"không phải là số nguyên tố");
            }
        }
    }

}
