package thuc_hanh;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int[] arr;
        do{
            System.out.println("Enter size");
            size=sc.nextInt();
            if(size>20){
                System.out.println("");
            }
        }while (size>20);

        arr=new int[size];
        int i=0;
        while (i<arr.length){
            System.out.print("Enter element"+(i+1)+":");
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.printf("Element in array :");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"\t");
        }
        int first=0;
        int last=size-1;
        while (first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }

        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }










    }
}
