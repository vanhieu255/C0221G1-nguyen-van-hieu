package controllers;

import commons.IdDocFile;
import commons.PersonException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputData {
    private static Scanner scanner = new Scanner(System.in);

    public static String nhapTen() {
        String ten = null;
        while (true) {
            try {
                System.out.println("nhap tên");
                ten = scanner.nextLine();
                PersonException.checkName(ten);
                break;
            } catch (PersonException e) {
                System.err.println(e.getMessage());
                ;
            }
        }
        return ten;
    }

    //String name, String date, String gender, String numberPhone
    public static String nhapDate() {
        String date = null;
        while (true) {
            try {
                System.out.println("nhap date :");
                date = scanner.nextLine();
                PersonException.checkDate(date);
                break;
            } catch (PersonException e) {
                System.err.println(e.getMessage());
            }
        }
        return date;
    }

    public static String nhapGioiTinh() {
        String gioiTinh = null;
        int chon;
        boolean check = false;
        while (true) {
            System.out.println("1.Nam\n" +
                    "2.Nu");
            while (true) {
                try {
                    chon = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("vui long nhap so");
                    e.printStackTrace();
                }
            }
            switch (chon) {
                case 1:
                    gioiTinh = "Nam";
                    check = true;
                    break;
                case 2:
                    gioiTinh = "Nu";
                    check = true;
                    break;
                default:
                    System.out.println("nhap sai ,nhap lai");
                    break;
            }
            if (check) {
                break;
            }

        }
        return gioiTinh;
    }

    public static String nhapNumberPhone() {
        String number = null;
        while (true) {
            try {
                System.out.println("nhap so dien thoai");
                number = scanner.nextLine();
                PersonException.checkNumberPhone(number);
                break;
            } catch (PersonException e) {
                System.err.println(e.getMessage());
                ;
            }
        }
        return number;
    }

    public static String nhapID() {
        String id = null;
        List<String> stringList = new ArrayList<>();
        stringList = IdDocFile.docFile();

        int chon = 0;
        do {
            for (int i = 0; i < stringList.size(); i++) {
                System.out.println((i + 1) + "." + stringList.get(i));
            }
            System.out.println("nhap chon :");
            chon = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < stringList.size(); i++) {
                if (i == (chon - 1)) {
                    id = stringList.get(i).split(",")[1];
                    break;
                }
            }

        } while (chon < 0 || chon > stringList.size());
        return id;
    }


    public static double nhapChieucao(){
        String chuoiCC=null;
        double chieucao=0.0;
        while (true){
            try{
                System.out.println("nhap chieu cao");
                chuoiCC=scanner.nextLine();
                PersonException.checkChieuCao(chuoiCC);
                chieucao=Double.parseDouble(chuoiCC);
                break;
            } catch (PersonException e) {
                System.err.println(e.getMessage());;
            }
        }
        return chieucao;
    }

    public static String nhapLop(){
        String lop=null;
        while (true){
            try {
                System.out.println("nhap lop");
                lop=scanner.nextLine();
                PersonException.checkClass(lop);
                break;
            } catch (PersonException e) {
                System.err.println(e.getMessage());
            }
        }
        return lop;
    }


}
