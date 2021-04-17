package bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Element of Array1");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Element " + (i + 1) + "of arra1:");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Input Element of Array2");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Element " + (i + 1) + "of arra2:");
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length ] = arr2[i];
        }
        System.out.println("giá trị mảng 3 :");


        for (int j = 0; j < arr3.length; j++) {

            System.out.print(arr3[j] + "\t");

        }
    }
}
