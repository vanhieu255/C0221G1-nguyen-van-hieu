package bai_tap;

import java.util.Scanner;

public class DemSoLuongKiTu {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("nhap chuoi ki tu");
        String chuoi=sc.nextLine();
        System.out.println("nhap ki tu");
        char a=sc.nextLine().charAt(0);

        int count=0;
        char[] arr = chuoi.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                count++;
            }
        }
        System.out.println("số lần kí tự xuất hiện trong chuoi"+count);

    }
}
