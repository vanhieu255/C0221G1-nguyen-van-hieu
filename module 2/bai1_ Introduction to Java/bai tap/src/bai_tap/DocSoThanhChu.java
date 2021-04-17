package bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input Number");
            int num = sc.nextInt();
            if (num >= 0 && num <= 10) {
                switch (num) {
                    case 0:
                        System.out.println("zero");
                        break;
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                    case 10:
                        System.out.println("ten");
                        break;
                    default:
                        System.out.println("out of ability");
                }

            } else if (num < 20) {
                switch (num - 10) {
                    case 1:
                        System.out.println("Eleven");
                        break;
                    case 2:
                        System.out.println("twelve");
                        break;
                    case 3:
                        System.out.println("thirteen");
                        break;
                    case 4:
                        System.out.println("fourteen");
                        break;
                    case 5:
                        System.out.println("fifteen");
                        break;
                    case 6:
                        System.out.println("sixteen");
                        break;
                    case 7:
                        System.out.println("seventeen");
                        break;
                    case 8:
                        System.out.println("eighteen");
                        break;
                    case 9:
                        System.out.println("nineteen");
                        break;
                }


            } else if (num >= 20 && num < 100) {
                switch (num / 10) {
                    case 2:
                        System.out.print("twenty ");
                        break;
                    case 3:
                        System.out.print("thirty ");
                        break;
                    case 4:
                        System.out.print("fourty ");
                        break;
                    case 5:
                        System.out.print("fifty ");
                        break;
                    case 6:
                        System.out.print("sixty ");
                        break;
                    case 7:
                        System.out.print("senventy ");
                        break;
                    case 8:
                        System.out.print("eighty ");
                        break;
                    case 9:
                        System.out.print("ninety ");
                        break;
                }
                switch (num % 10) {
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;

                }

            } else if (num >= 100 && num < 1000) {
                switch (num / 100) {
                    case 1:
                        System.out.print("one hundred ");
                        break;
                    case 2:
                        System.out.print("two hundred ");
                        break;
                    case 3:
                        System.out.print("three hundred ");
                        break;
                    case 4:
                        System.out.print("four hundred ");
                        break;
                    case 5:
                        System.out.print("five hundred ");
                        break;
                    case 6:
                        System.out.print("six hundred ");
                        break;
                    case 7:
                        System.out.print("seven hundred ");
                        break;
                    case 8:
                        System.out.print("eight hundred");
                        break;
                    case 9:
                        System.out.print("nine hundred");
                        break;
                }
                if ((num % 100) < 20) {
                    switch ((num % 100) - 10) {
                        case 1:
                            System.out.println("Eleven");
                            break;
                        case 2:
                            System.out.println("twelve");
                            break;
                        case 3:
                            System.out.println("thirteen");
                            break;
                        case 4:
                            System.out.println("fourteen");
                            break;
                        case 5:
                            System.out.println("fifteen");
                            break;
                        case 6:
                            System.out.println("sixteen");
                            break;
                        case 7:
                            System.out.println("seventeen");
                            break;
                        case 8:
                            System.out.println("eighteen");
                            break;
                        case 9:
                            System.out.println("nineteen");
                            break;
                    }

                } else {
                    switch ((num % 100) / 10) {
                        case 2:
                            System.out.print("twenty ");
                            break;
                        case 3:
                            System.out.print("thirty ");
                            break;
                        case 4:
                            System.out.print("fourty ");
                            break;
                        case 5:
                            System.out.print("fifty ");
                            break;
                        case 6:
                            System.out.print("sixty ");
                            break;
                        case 7:
                            System.out.print("senventy ");
                            break;
                        case 8:
                            System.out.print("eighty ");
                            break;
                        case 9:
                            System.out.print("ninety ");
                            break;

                    }
                    switch (num % 10) {
                        case 1:
                            System.out.println("one");
                            break;
                        case 2:
                            System.out.println("two");
                            break;
                        case 3:
                            System.out.println("three");
                            break;
                        case 4:
                            System.out.println("four");
                            break;
                        case 5:
                            System.out.println("five");
                            break;
                        case 6:
                            System.out.println("six");
                            break;
                        case 7:
                            System.out.println("seven");
                            break;
                        case 8:
                            System.out.println("eight");
                            break;
                        case 9:
                            System.out.println("nine");
                            break;

                    }

                    i++;
                }
            }
        }
    }
}
