package bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập x");
        int x = sc.nextInt();
        System.out.println("nhap số lượng phần tử của mảng");
        int n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
            }
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        int[] arr2 = new int[arr.length - 1];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[i];
        }


        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + "\t");
        }


    }
}
