package thuchanh;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Input A");
        a=sc.nextInt();
        System.out.println("Input B");
        b=sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0||b==0){
            System.out.println("No greatest common factor");
        }else{
            while (a!=b){
                if(a>b){
                    a=a-b;
                }else {
                    b=b-a;
                }
            }
            System.out.println("Greatest common factor :"+a);
        }

    }
}
