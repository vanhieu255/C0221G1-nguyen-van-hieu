package Controllers;

import Commons.DocGhiFile;
import Commons.DocGhiFileCustomer;
import Models.Customer;
import Models.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CacPhuongThucDatDichVu {
    public static Scanner scanner = new Scanner(System.in);

    public static void datVilla() {
        List<Customer> customerList = new ArrayList<>();
        List<String> servicesList = new ArrayList<>();
        int chon;
        int chon1;
        boolean check1 = false;
        boolean check = false;
        boolean flag = true;
        boolean flag1 = true;
        String line =null;
        while (flag) {
            customerList = DocGhiFileCustomer.docFile("Customer.CSV");
            for (int i = 0; i < customerList.size(); i++) {
                System.out.println((i + 1) + "." + customerList.get(i));
            }
            System.out.println("nhap chon :");
            chon = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < customerList.size(); i++) {
                if ((chon - 1) == i) {
                    line=customerList.get(i).toString();
                    check1 = true;
                    flag = false;
                    break;
                }
            }
            if (!check1) {
                System.out.println("nhap sai roi , vui long nhap lai");
            }
        }

        while (flag1) {
            List<Services> villaList = new ArrayList<>();
            villaList = DocGhiFile.docFile("villa.csv");
            for (int i = 0; i < villaList.size(); i++) {
                System.out.println((i + 1) + "." + villaList.get(i));
            }
            System.out.println("nhap chon :");
            chon1 = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < villaList.size(); i++) {
                if ((chon1 - 1) == i) {
                    line+=","+villaList.get(i).toString();
                    check = true;
                    flag1 = false;
                    break;
                }
            }
            if (!check) {
                System.out.println("nhap sai roi , vui long nhap lai");
            }
        }
        servicesList.add(line);
        DocGhiFileCustomer.ghiFile("Booking.CSV", servicesList, true);
    }

    public static void datHouse() {
        List<Customer> customerList = new ArrayList<>();
        List<String> servicesList = new ArrayList<>();
        int chon;
        int chon1;
        boolean check1 = false;
        boolean check = false;
        boolean flag = true;
        boolean flag1 = true;
        while (flag) {
            customerList =DocGhiFileCustomer.docFile("Customer.CSV");
            for (int i = 0; i < customerList.size(); i++) {
                    System.out.println((i + 1) + "." + customerList.get(i));
                }
                System.out.println("nhap chon :");
                chon = Integer.parseInt(scanner.nextLine());

                for (int i = 0; i < customerList.size(); i++) {
                    if ((chon - 1) == i) {
                        servicesList.add(customerList.get(i).toString());
                        check1 = true;
                        flag = false;
                        break;
                    }
                }
                if (!check1) {
                    System.out.println("nhap sai roi , vui long nhap lai");
                }
            }

            while (flag1) {
                List<Services> houseList = new ArrayList<>();
                houseList = DocGhiFile.docFile("house.csv");
                for (int i = 0; i < houseList.size(); i++) {
                    System.out.println((i + 1) + "." + houseList.get(i));
                }
                System.out.println("nhap chon :");
                chon1 = Integer.parseInt(scanner.nextLine());

                for (int i = 0; i < houseList.size(); i++) {
                    if ((chon1 - 1) == i) {
                        servicesList.add(houseList.get(i).toString());
                    check = true;
                    flag1 = false;
                    break;
                }
            }
            if (!check) {
                System.out.println("nhap sai roi , vui long nhap lai");
            }
        }
       DocGhiFileCustomer.ghiFile("Booking.CSV", servicesList, true);

    }

    public static void datRoom() {
        List<Customer> customerList = new ArrayList<>();
        List<String> servicesList = new ArrayList<>();
        int chon;
        int chon1;
        boolean check1 = false;
        boolean check = false;
        boolean flag = true;
        boolean flag1 = true;
        while (flag) {
            customerList = DocGhiFileCustomer.docFile("Customer.CSV");
            for (int i = 0; i < customerList.size(); i++) {
                System.out.println((i + 1) + "." + customerList.get(i));
            }
            System.out.println("nhap chon :");
            chon = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < customerList.size(); i++) {
                if ((chon - 1) == i) {
                    servicesList.add(customerList.get(i).toString());
                    check1 = true;
                    flag = false;
                    break;
                }
            }
            if (!check1) {
                System.out.println("nhap sai roi , vui long nhap lai");
            }
        }

        while (flag1) {
            List<Services> roomList = new ArrayList<>();
            roomList = DocGhiFile.docFile("room.csv");
            for (int i = 0; i < roomList.size(); i++) {
                System.out.println((i + 1) + "." + roomList.get(i));
            }
            System.out.println("nhap chon :");
            chon1 = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < roomList.size(); i++) {
                if ((chon1 - 1) == i) {
                    servicesList.add(roomList.get(i).toString());
                    check = true;
                    flag1 = false;
                    break;
                }
            }
            if (!check) {
                System.out.println("nhap sai roi , vui long nhap lai");
            }
        }
        DocGhiFileCustomer.ghiFile("Booking.CSV", servicesList, true);
    }

}
