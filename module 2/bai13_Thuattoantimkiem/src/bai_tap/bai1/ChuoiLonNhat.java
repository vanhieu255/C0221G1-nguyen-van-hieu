package bai_tap.bai1;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String string = sc.nextLine();
        LinkedList max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
                list.clear();
            }

            for (Object ch : max) {
                System.out.println(ch);
            }

        }
    }

