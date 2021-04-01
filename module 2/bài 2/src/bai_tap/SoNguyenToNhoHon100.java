package bai_tap;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String result = "";
        while (num < 100) {
            boolean check = true;
            if (num < 2) {
                check = false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    result += num + ",";
                }
            }
            num++;
        }
        System.out.print(result);
    }
}
