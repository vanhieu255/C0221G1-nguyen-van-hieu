package controllers;

import commons.BatLoi;

import java.util.Scanner;

public class NhapDuLieu {
    //Tên, ngày sinh, giới tính , số điện thoại, mã lớp,lop,chieu cao

    private static Scanner scanner = new Scanner(System.in);

    public static String nhapTen() {
        String ten = null;
        while (true) {
            try {
                System.out.println("nhap tên : ");
                ten = scanner.nextLine();
                BatLoi.kiemTraTen(ten);
                break;
            } catch (BatLoi batLoi) {
                System.out.println(batLoi.getMessage());
            }
        }
       return ten;
    }
    public static String nhapNgaySinh(){
        String ngaySinh=null;
        while (true){
            try {
                System.out.println("nhap ngày sinh :");
                ngaySinh = scanner.nextLine();
                BatLoi.kiemTraNgaySinh(ngaySinh);
                break;
            } catch (BatLoi batLoi) {
                System.err.println(batLoi.getMessage());;
            }
        }
        return ngaySinh;
    }

    public static String nhapGioiTinh(){
        String gioiTinh=null;
        while (true){
            try {
                System.out.println("nhap gioi tinh :");
                gioiTinh = scanner.nextLine();
                BatLoi.kiemTraGioiTinh(gioiTinh);
                break;
            } catch (BatLoi batLoi) {
                System.err.println(batLoi.getMessage());;
            }
        }
        return gioiTinh;
    }
    public static int nhapSoDienThoai(){
        String chuoiSoDienThoai=null;
        int soDienThoai=0;
        while (true){
            try{
                System.out.println("nhap so dien thoai :");
                chuoiSoDienThoai=scanner.nextLine();
                BatLoi.kiemTraSoDientThoai(chuoiSoDienThoai);
                soDienThoai=Integer.parseInt(chuoiSoDienThoai);
                break;
            } catch (BatLoi batLoi) {
                System.err.println(batLoi.getMessage());
            }
        }
        return soDienThoai;
    }
    public static double nhapMaLop(){
        String chuoiMaLop=null;
        double maLop=0;
        while (true){
            try{
                System.out.println("nhap ma lop :");
                chuoiMaLop=scanner.nextLine();
                BatLoi.kiemTraMaLop(chuoiMaLop);
                maLop=Double.parseDouble(chuoiMaLop);
                break;
            } catch (BatLoi batLoi) {
                System.err.println(batLoi.getMessage());
            }
        }
        return maLop;
    }
    public static String nhapLop(){
        String lop=null;
        while (true) {
            try{
                System.out.println("nhap lop :");
                lop=scanner.nextLine();
                BatLoi.kiemTraLop(lop);
                break;
            } catch (BatLoi batLoi) {
                System.err.println(batLoi.getMessage());
            }
        }
        return lop;
    }
    public static double nhapChieuCao(){
        String chuoiChieuCao=null;
        double chieuCao=0.0;
        while (true){
            try {
                System.out.println("nhap chieu cao ");
                chuoiChieuCao=scanner.nextLine();
                BatLoi.kiemTraChieuCao(chuoiChieuCao);
                chieuCao=Double.parseDouble(chuoiChieuCao);
                break;
            } catch (BatLoi batLoi) {
                System.err.println(batLoi.getMessage());
            }
        }
        return chieuCao;
    }


}
