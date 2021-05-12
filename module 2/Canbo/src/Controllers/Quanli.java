package Controllers;

import java.util.Scanner;

public class Quanli {
    private static Scanner scanner = new Scanner(System.in);

    public static void danhSach() {
        int chon;
        do {
            System.out.println("1.Xem danh sách" +
                    "2.thêm mới\n" +
                    "3.câp nhap \n" +
                    "4.xóa\n" +
                    "5.tim kiem\n" +
                    "6.Doc tu file\n" +
                    "7.ghi vao file\n" +
                    "8.thoát");
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
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("nhap sai roi, nhap lai");
            }
        } while (true);
    }
}
