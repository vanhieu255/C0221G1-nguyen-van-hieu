package Controllers;

import java.util.Scanner;

public class Quanli {
    private static Scanner scanner = new Scanner(System.in);

    public static void danhSach() {
        int chon;
        do {
            System.out.println("1.Nhap thông tin\n" +
                    "2.Tim kiem theo ten\n" +
                    "3.sap xep theo tên\n" +
                    "4.Hien thi thông tin\n" +
                    "5.Thoat");
            System.out.println("Nhap chon");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                  CacPhuongThucDanhSach.nhapThongTin();
                    break;
                case 2:
                  CacPhuongThucDanhSach.timKiemTheoTen();
                    break;
                case 3:
                    CacPhuongThucDanhSach.sapXepTheoTen();
                    break;
                case 4:
                   CacPhuongThucDanhSach.hienThiThongTin();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("nhap sai roi, nhap lai");
            }
        } while (true);
    }
}
