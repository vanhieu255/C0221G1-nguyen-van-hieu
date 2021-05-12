package controllers;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import commons.BatLoi;

import java.util.Scanner;

public class NhapDuLieu {
    //Số điện thoại. - Nhóm của danh bạ. - Họ tên. - Giới tính. - Địa chỉ - Ngày sinh. - Email.
    private static Scanner scanner = new Scanner(System.in);

    public static int nhapSoDienThoai() {
        String chuoiSoDienThoai = null;
        int soDienThoai = 0;
        while (true) {
            try {
                System.out.println("nhap so dien thoai :");
                chuoiSoDienThoai = scanner.nextLine();
                BatLoi.kiemTraSoDientThoai(chuoiSoDienThoai);
                soDienThoai = Integer.parseInt(chuoiSoDienThoai);
                break;
            } catch (BatLoi batLoi) {
                System.err.println(batLoi.getMessage());
            }
        }
        return soDienThoai;
    }

    public static int nhapNhomDanhBa() {
        System.out.println("nhap so nhóm danh ba :");
        int nhomDanhBa = Integer.parseInt(scanner.nextLine());
        return nhomDanhBa;
    }

    public static String nhapHoTen(){
        System.out.println("nhap ho va ten :");
        String hoTen=scanner.nextLine();
        return hoTen;
    }
    public static String nhapGioiTinh(){
        System.out.println("nhap gioi tính :");
        String gioiTinh=scanner.nextLine();
        return gioiTinh;
    }

    public static String nhapDiaChi(){
        System.out.println("nhap dia chi :");
        String diaChi=scanner.nextLine();
        return diaChi;
    }
    public static String nhapNgaySinh(){
        System.out.println("nhap ngay sinh :");
        String ngaySinh=scanner.nextLine();
        return ngaySinh;
    }
    public static String nhapEmail(){
        String email = null;
        while (true) {
            try {
                System.out.println("nhap email : ");
                email = scanner.nextLine();
                BatLoi.kiemTraEmail(email);
                break;
            } catch (BatLoi batLoi) {
                System.out.println(batLoi.getMessage());
            }
        }
        return email;
    }

}
