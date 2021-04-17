package thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input n");
        int n=sc.nextInt();
        int[] arr;
        arr=new int[n];
        System.out.println("Input element:");
        for(int i=0;i<arr.length;i++){
            System.out.print("Element"+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        int index=0;

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        System.out.println("max của mảng " +max+" index :"+index);
    }
}
