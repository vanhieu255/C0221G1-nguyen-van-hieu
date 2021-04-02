package bai_tap;

import java.util.Scanner;

public class TinhTongCacSo1Cot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number row");
        int n = sc.nextInt();
        System.out.println("Input number column");
        int m = sc.nextInt();
        int[][] arr;
        arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("nhap giá tri mảng");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("you want total number column :");
        int k = sc.nextInt();
        int total = 0;
        for (int i = 0; i < arr.length; i++)
            total += arr[i][k];
        System.out.println("Sum for column " + k + " is "
                + total);

    }
}
