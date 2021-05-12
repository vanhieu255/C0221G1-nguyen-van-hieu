package controllers;

import commons.DocGhiFile;
import models.DanhBa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiDanhBa {
    private static Scanner scanner = new Scanner(System.in);

    public static void danhBa() {
        String chon;
        do {
            System.out.println("1.xem danh sach\n" +
                    "2.them moi\n" +
                    "3.cap nhap\n" +
                    "4.xóa\n" +
                    "5.tìm kiếm\n" +
                    "6.doc tu file\n" +
                    "7.ghi tu file\n" +
                    "8.thoát");
            System.out.println("Nhap chon");
            chon = scanner.nextLine();
            switch (chon) {
                case "1":
                    XemDanhBa.xem();
                    break;
                case "2":
                    ThemMoiDanhBa.themDanhBA();
                    break;
                case "3":
                    CapNhapDanhBA.capNhap();
                    break;
                case "4":
                    XoaDanhBA.xoa();
                    break;
                case "5":
                   TimKiemDanhBa.timKiem();
                    break;
                case "6":
//                  DocGhiFile.ghiFile();
                    break;
                case "7":
                    DocGhiFile.docFile("danhba.csv");
                    break;
                case "8":
                    System.exit(0);
                default:
                    System.out.println("nhap sai roi, nhap lai");
            }
        } while (true);
    }

}
