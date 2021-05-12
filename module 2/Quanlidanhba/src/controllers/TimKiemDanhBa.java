package controllers;

import commons.DocGhiFile;
import models.DanhBa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimKiemDanhBa {
    public static Scanner scanner = new Scanner(System.in);
    public static void timKiem(){
        System.out.println("nhap số điện thoại ");
       int soDienThoai1 = Integer.parseInt(scanner.nextLine());
        List<DanhBa> danhBaList = new ArrayList<>();
        danhBaList = DocGhiFile.docFile("danh.csv");
        boolean check = false;
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getSoDienThoai()==soDienThoai1) {
                System.out.println(danhBaList.get(i));
                DocGhiFile.ghiFile("connguoi.csv", danhBaList, false);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("không tìm thấy số điện thoại");
        }

    }
}
