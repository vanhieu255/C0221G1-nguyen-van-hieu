package bai_tap;

import java.util.Scanner;

public class GiaTriLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr;
        arr=new int[2][2];

        for (int i = 0;i< arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                System.out.println("nhap giá tri mảng");
                arr[i][j] = sc.nextInt();
            }
        }
        int max=arr[0][0];

        for (int i = 0;i< arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("giá trị lớn nhất mảng 2 chiều là :"+max);

    }
}
