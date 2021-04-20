package thuc_hanh.Optional_thuchanh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String :");
        String inputString = scanner.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
                int ascii = (int) inputString.charAt(i);
                frequentChar[ascii]+=1;
        }

        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
//        List<Character>list=new ArrayList<>();
//        for(int i=0;i<inputString.length();i++) {
//            list.add(inputString.charAt(i));
//        }
//        int count=0;
//        for(int i=0;i<list.size();i++){
//
//            for(int j=i+1;j<list.size();j++){
//                if(list.get(i)==list.get(j)){
//                    char a=list.get(i);
//                    count=count+1;
//                }
//
//            }
//        }
//        System.out.println(" chữ cái xuất hiện trong mảng nhiều là: "+count);


    }
}
