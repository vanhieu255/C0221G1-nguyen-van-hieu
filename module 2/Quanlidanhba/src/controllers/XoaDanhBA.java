package controllers;

import commons.DocGhiFile;
import models.DanhBa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XoaDanhBA {
    public static Scanner scanner = new Scanner(System.in);

    public static void xoa() {
        System.out.println("nhap số điện thoại ");
       int soDienThoai1 =Integer.parseInt( scanner.nextLine());
        List<DanhBa> danhBaList = new ArrayList<>();
        danhBaList = DocGhiFile.docFile("danh.csv");
        boolean check = false;
        for (int i = 0; i < danhBaList.size(); i++) {
            if (danhBaList.get(i).getSoDienThoai()==soDienThoai1) {
                danhBaList.remove(i);
                DocGhiFile.ghiFile("danh.csv", danhBaList, false);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("không tìm thấy số điện thoại");
        }

    }

}

