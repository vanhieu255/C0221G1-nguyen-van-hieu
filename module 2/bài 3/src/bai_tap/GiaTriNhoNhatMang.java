package bai_tap;

import java.util.Scanner;

public class GiaTriNhoNhatMang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Size");
        int size=sc.nextInt();
        int[] arr;
        arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Input Element"+(i+1)+": ");
            arr[i]=sc.nextInt();
        }

        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("value min of array :"+min);

    }
}
