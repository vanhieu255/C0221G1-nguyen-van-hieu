package bai_tap;

import java.util.Scanner;

public class HienThiSinhVienPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sv=0;
        do {
            System.out.println("Input number SV");
             sv = sc.nextInt();
            if (sv > 30) {
                System.out.println("False , you should exceed 30 ");
            }
        } while (sv > 30);

        int[] arr = new int[sv];
        for (int i = 0; i < sv; i++) {
            System.out.println("nhap diem sinh viên " + (i + 1) + " =");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 10) {
                System.out.println("sinh viên " + (i + 1) + "pass");
            }
        }
    }
}

