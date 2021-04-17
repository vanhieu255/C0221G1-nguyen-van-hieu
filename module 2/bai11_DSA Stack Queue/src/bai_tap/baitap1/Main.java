package bai_tap.baitap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
         Stack<String> stack= new Stack<String>();
         stack.push("NGUYEN");
        stack.push("VAN");
        stack.push("HIEU");

        String b="";
        int a=stack.size();

        for (int i=0;i<a;i++){
            b=b+" "+stack.pop();
        }
        System.out.println(b);

        }
//        arr.add(1);
//        arr.add(2);
//        arr.add(5);
//        arr.add(4);
//        int a = arr.size();
//        for(int i=0;i<a;i++){
//            stack.push((Integer) arr.remove(0));
//        }
//        System.out.println(stack);
//        int temp=stack.size();
//        for(int i=0;i<temp;i++){
//            arr.add(stack.pop());
//        }
////        System.out.println(arr);
//        Collections.reverse(arr);
//        System.out.println(arr);





    }

