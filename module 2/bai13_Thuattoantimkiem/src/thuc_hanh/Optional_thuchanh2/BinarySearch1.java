package thuc_hanh.Optional_thuchanh2;

import thuc_hanh.bai1.BinarySearch;

import java.util.Scanner;

public class BinarySearch1 {
    static int binarySearch1(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (x > arr[mid]) {
                int leftnew = mid + 1;
                return binarySearch1(arr, leftnew, right, x);
            } else {
                int rightnew = mid - 1;
                return binarySearch1(arr, left, rightnew, x);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap size");
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("nhap elment "+(i+1));
             arr[i]=sc.nextInt();
        }
        System.out.println("nhap x");
        int x=sc.nextInt();
        int left=0;
        int right=arr.length-1;
        System.out.println(binarySearch1(arr,left,right,x));

    }
}


