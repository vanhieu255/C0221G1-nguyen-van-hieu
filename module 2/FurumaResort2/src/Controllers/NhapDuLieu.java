package Controllers;

import Commons.BatLoi;

import java.util.Scanner;

public class NhapDuLieu {
    public static Scanner scanner = new Scanner(System.in);

    public static String nhapTenDichVU() {
        String tenDichVu = null;
        while (true) {
            try {
                System.out.println("nhap ten dich vu :");
                tenDichVu = scanner.nextLine();
                BatLoi.kiemTraTenDichVu(tenDichVu);
                break;
            } catch (BatLoi batLoi) {
                System.out.println(batLoi.getMessage());
            }
        }
        return tenDichVu;
    }

    public static double nhapDienTichSuDung() {

        while (true) {
            System.out.println("nhap dien tich su dung :");
            Double dienTichSuDung = Double.parseDouble(scanner.nextLine());
            if (dienTichSuDung > 30) {
                return dienTichSuDung;
            }else{
                System.out.println("nhap sai roi ,vui long nhap lai :>30");
            }
        }
    }

    public static double nhapChiPhiThue() {
        while (true) {
            System.out.println("nhap chi phi thue :");
            Double chiPhiThue = Double.parseDouble(scanner.nextLine());
            if (chiPhiThue > 0) {
                return chiPhiThue;
            } else {
                System.out.println("nhap sai roi , vui long nhap lai : >20");
            }

        }
    }

    public static int nhapSoLuongNguoi() {
        while (true) {
            System.out.println("nhap so luong nguoi :");
            int soLuongNguoi = Integer.parseInt(scanner.nextLine());
            if (soLuongNguoi > 0 && soLuongNguoi < 20) {
                return soLuongNguoi;
            } else {
                System.out.println("nhap sai roi vui long nhap lai : 0<x<20");
            }
        }
    }

    public static String nhapKieuThue() {
        String kieuThue=null;
        while (true) {
            try{
            System.out.println("nhap kieu thue :");
             kieuThue = scanner.nextLine();
            BatLoi.kiemTraTenDichVu(kieuThue);
            break;
            } catch (BatLoi batLoi) {
                batLoi.printStackTrace();
            }
        }
        return kieuThue;
    }

    public static String nhapTieuChuanPhong() {
        String tieuChuanPhong=null;
        while (true) {
            try{
            System.out.println("nhap tieu chuan phong :");
            tieuChuanPhong = scanner.nextLine();
            BatLoi.kiemTraTenDichVu(tieuChuanPhong);
            break;
            } catch (BatLoi batLoi) {
                batLoi.printStackTrace();
            }
        }
        return tieuChuanPhong;
    }

    public static String nhapMoTaTienNghi() {
        System.out.println("nhap mo ta tien nghi");
        String moTaTienNghi = scanner.nextLine();
        return moTaTienNghi;
    }

    public static double nhapDienTichHoBoi() {
        System.out.println("nhap dien tich ho boi :");
        double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
        return dienTichHoBoi;
    }

    public static int nhapSoTang() {
        while (true) {
            System.out.println("nhap so tang :");
            int soTan = Integer.parseInt(scanner.nextLine());
            if(soTan>0) {
                return soTan;
            }else {
                System.out.println("nhap sai roi vui long nhap lai : >0");
            }
        }
    }

    //String tenDichVuDiKem, double donVi, double giaTien
    public static String nhapTenDichVuDiKem() {
        while (true) {
            String[] array = {"massage", "karaoke", "food", "drink", "car"};
            boolean check = false;
            System.out.println("nhap ten dich vu di kem :");
            String tenDichVuDiKem = scanner.nextLine();
            for (String i : array) {
                if (i.equals(tenDichVuDiKem)) {
                    check = true;
                }
            }
            if (check) {
                return tenDichVuDiKem;
            } else {
                System.out.println("nhap sai roi vui long nhap lai : massage, karaoke, food, drink, car");
            }
        }
    }

    public static double nhapDonVi() {
        System.out.println("nhap don vi :");
        double donVi = Double.parseDouble(scanner.nextLine());
        return donVi;
    }

    public static double nhapGiaTien() {
        System.out.println("nhap gia tien :");
        double giaTien = Double.parseDouble(scanner.nextLine());
        return giaTien;
    }


    //Nhap Du Lieu Khach Hang


    public static String nhapTenKhachHang(){
        System.out.println("nhap ten khach hang :");
        String tenKhachHang=scanner.nextLine();
        return tenKhachHang;
    }
    public static String nhapNgaySinh(){
        System.out.println("Nhap ngay sinh cua khach hang :");
        String ngaySinh=scanner.nextLine();
        return ngaySinh;
    }
    public static String nhapGioiTinh(){
        System.out.println("nhap gioi tinh cua khach hang :");
        String gioiTinh=scanner.nextLine();
        return gioiTinh;
    }
    public static int nhapCmnd(){
        System.out.println("nhap chung minh cua khach hang :");
        int cmnd=Integer.parseInt(scanner.nextLine());
        return cmnd;
    }
    public static int nhapSdt(){
        System.out.println("nhap so dien thoai cua khach hang :");
        int sdt=Integer.parseInt(scanner.nextLine());
        return sdt;
    }
    public static String nhapEmail(){
        System.out.println("nhap Email khach hang :");
        String email=scanner.nextLine();
        return email;
    }
    public static String nhapLoaiKhachHang(){
        System.out.println("nhap loai khach hang :");
        String loaiKhachHang=scanner.nextLine();
        return loaiKhachHang;
    }
    public static String nhapDiaChiKhachHang(){
        System.out.println("nhap dia chi khach hang :");
        String diaChi=scanner.nextLine();
        return diaChi;
    }









}
