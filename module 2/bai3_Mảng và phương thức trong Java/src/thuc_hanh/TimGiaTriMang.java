package thuc_hanh;

import java.util.Scanner;

public class TimGiaTriMang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("nhap tên ");
        String a=sc.nextLine();
        boolean check=false;
        for(int i=0;i<students.length;i++){
            if(students[i].equals(a)){
                check=true;
                break;
            }

        }if(check){
            System.out.println("Position of the students in the list " + a);
        }else{
            System.out.println("Not found"+a + " in the list.");
        }

    }
}
