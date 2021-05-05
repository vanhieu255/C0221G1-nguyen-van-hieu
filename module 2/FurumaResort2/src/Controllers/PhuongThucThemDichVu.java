package Controllers;

import Commons.DocGhiFile;
import Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhuongThucThemDichVu {
    public static Scanner scanner = new Scanner(System.in);

    public static void themDichVu() {
        int chon;
        while (true) {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            System.out.println("nhap lua chon :");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    themVilla();
                    break;
                case 2:
                    themHouse();
                    break;
                case 3:
                    themRoom();
                    break;
                case 4:
                    return;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("nhap sai roi , vui long nhap lai");
            }

        }


    }


    //String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanPhong,
// String moTaTienNghi, double dienTichHoBoi, int soTang
    private static void themVilla() {
        String tenDichVu = NhapDuLieu.nhapTenDichVU();
        double dienTichSuDung = NhapDuLieu.nhapDienTichSuDung();
        double chiPhiThue = NhapDuLieu.nhapChiPhiThue();
        int soLuongNguoi = NhapDuLieu.nhapSoLuongNguoi();
        String kieuThue = NhapDuLieu.nhapKieuThue();
        String tieuChuanPhong = NhapDuLieu.nhapTieuChuanPhong();
        String moTaTienNghi = NhapDuLieu.nhapMoTaTienNghi();
        double dienTichHoBoi = NhapDuLieu.nhapDienTichHoBoi();
        int soTang = NhapDuLieu.nhapSoTang();
        List<Services> servicesList = new ArrayList<>();
        Services villa = new Villa(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, tieuChuanPhong, moTaTienNghi, dienTichHoBoi, soTang);
        servicesList.add(villa);

        DocGhiFile.ghiFlie("villa.csv", servicesList, true);

    }
    private static void themHouse() {
        String tenDichVu = NhapDuLieu.nhapTenDichVU();
        double dienTichSuDung = NhapDuLieu.nhapDienTichSuDung();
        double chiPhiThue = NhapDuLieu.nhapChiPhiThue();
        int soLuongNguoi = NhapDuLieu.nhapSoLuongNguoi();
        String kieuThue = NhapDuLieu.nhapKieuThue();
        String tieuChuanPhong = NhapDuLieu.nhapTieuChuanPhong();
        String moTaTienNghi = NhapDuLieu.nhapMoTaTienNghi();
        int soTang = NhapDuLieu.nhapSoTang();
        List<Services> servicesList = new ArrayList<>();
        Services house = new House(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, tieuChuanPhong, moTaTienNghi, soTang);
        servicesList.add(house);

        DocGhiFile.ghiFlie("house.csv", servicesList, true);
    }

    private static void themRoom() {
        //String tenDichVuDiKem, double donVi, double giaTien
        String tenDichVu = NhapDuLieu.nhapTenDichVU();
        double dienTichSuDung = NhapDuLieu.nhapDienTichSuDung();
        double chiPhiThue = NhapDuLieu.nhapChiPhiThue();
        int soLuongNguoi = NhapDuLieu.nhapSoLuongNguoi();
        String kieuThue = NhapDuLieu.nhapKieuThue();
        String tenDichVuDiKem=NhapDuLieu.nhapTenDichVuDiKem();
        double donVi=NhapDuLieu.nhapDonVi();
        double giaTien=NhapDuLieu.nhapGiaTien();
        List<Services> servicesList = new ArrayList<>();
        DichVuDiKem dichVuDiKem=new DichVuDiKem(tenDichVuDiKem,donVi, giaTien);
        Services room = new Room(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue,dichVuDiKem);
        servicesList.add(room);
        DocGhiFile.ghiFlie("room.csv", servicesList, true);
    }
}