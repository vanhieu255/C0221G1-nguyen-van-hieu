package bai_tap;

import java.util.Scanner;

public class TongDuongCheoChinh {
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

        int total = 0;
        for (int i = arr.length-1; i>=0; i--)
            total += arr[i][i];
        System.out.println("tong duong cheo chinh " + total);

    }
}
