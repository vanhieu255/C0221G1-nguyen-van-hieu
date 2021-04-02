package bai_tap;

import java.util.Scanner;

public class ThemPhanTuMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Element");
        int n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }

        System.out.println("Input value you want add");
        int x = sc.nextInt();
        System.out.println("Input index");
        int index = sc.nextInt();

        int[] arr2 = new int[arr.length +1];;
        if (index <= 1 || index >= arr.length - 1) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            arr2[index] = x;
            for (int i = 0; i < arr.length; i++) {
                if (i < index) {
                    arr2[i] = arr[i];
                } else if (i == index) {
                    arr2[index] = x;
                } else {
                    arr2[i] = arr[i-1];
                    arr2[arr2.length-1]=arr[arr.length-1];
                }
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + "\t");

        }
    }
}

