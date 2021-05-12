package controllers;

import commons.DocGhiFile;
import models.DanhBa;

import java.util.ArrayList;
import java.util.List;

public class ThemMoiDanhBa {
    //private int soDienThoai;
    //    private int nhomDanhBa;
    //    private String hoTen;
    //    private String gioiTinh;
    //    private String diaChi;
    //    private String ngaySinh;
    //    private String email;
    public static void themDanhBA(){
        int soDienThoai =NhapDuLieu.nhapSoDienThoai();
        int nhomDanhba=NhapDuLieu.nhapNhomDanhBa();
        String hoTen=NhapDuLieu.nhapHoTen();
        String gioiTinh=NhapDuLieu.nhapGioiTinh();
        String diaChi=NhapDuLieu.nhapDiaChi();
        String ngaySinh=NhapDuLieu.nhapNgaySinh();
        String email=NhapDuLieu.nhapEmail();
        List<DanhBa> danhBaList=new ArrayList<>();
        DanhBa danhBa=new DanhBa(soDienThoai,nhomDanhba,hoTen,gioiTinh,diaChi,ngaySinh,email);
        danhBaList.add(danhBa);
        DocGhiFile.ghiFile("danh.csv",danhBaList,true);
    }
    }

