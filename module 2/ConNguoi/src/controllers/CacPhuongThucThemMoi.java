package controllers;

import commons.DocGhiFile;
import models.ConNguoi;
import models.GiaoVien;
import models.HocSinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CacPhuongThucThemMoi {
    //String ten, String ngaySinh, String gioiTinh, int soDienThoai, double maLop
    public static void themHocSinh(){
        String ten=NhapDuLieu.nhapTen();
        String ngaySinh=NhapDuLieu.nhapNgaySinh();
        String gioiTinh=NhapDuLieu.nhapGioiTinh();
        int soDienThoai=NhapDuLieu.nhapSoDienThoai();
        double maLop=NhapDuLieu.nhapMaLop();
        List<ConNguoi> conNguoiList=new ArrayList<>();
        ConNguoi hocSinh=new HocSinh(ten,ngaySinh,gioiTinh,soDienThoai,maLop);
        conNguoiList.add(hocSinh);
        DocGhiFile.ghiFile("connguoi.csv",conNguoiList,true);

    }
    public static void themGiaoVien(){
        String ten=NhapDuLieu.nhapTen();
        String ngaySinh=NhapDuLieu.nhapNgaySinh();
        String gioiTinh=NhapDuLieu.nhapGioiTinh();
        int soDienThoai=NhapDuLieu.nhapSoDienThoai();

        String lop=NhapDuLieu.nhapLop();
        double chieuCao=NhapDuLieu.nhapChieuCao();
        List<ConNguoi> conNguoiList=new ArrayList<>();
        ConNguoi giaoVien=new GiaoVien(ten,ngaySinh,gioiTinh,soDienThoai,lop,chieuCao);
        conNguoiList.add(giaoVien);
        DocGhiFile.ghiFile("connguoi.csv",conNguoiList,true);
    }

}
