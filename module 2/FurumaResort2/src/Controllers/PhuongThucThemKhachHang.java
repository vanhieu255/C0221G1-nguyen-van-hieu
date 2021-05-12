package Controllers;

import Commons.DocGhiFile;
import Commons.DocGhiFileCustomer;
import Models.Customer;
import Models.Services;

import java.util.ArrayList;
import java.util.List;

public class PhuongThucThemKhachHang {
    public static void themKhachHang(){
        //    private String tenKhachHang;
//    private String ngaySinh;
//    private String gioiTinh;
//    private int cmnd;
//    private int sdt;
//    private String email;
//    private String loaiKhach;
//    private String diaChi;

        String tenKhachHang=NhapDuLieu.nhapTenKhachHang();
        String ngaySinh=NhapDuLieu.nhapNgaySinh();
        String gioiTinh=NhapDuLieu.nhapGioiTinh();
        int cmnd=NhapDuLieu.nhapCmnd();
        int sdt=NhapDuLieu.nhapSdt();
        String email=NhapDuLieu.nhapEmail();
        String loaiKhach=NhapDuLieu.nhapLoaiKhachHang();
        String diaChi=NhapDuLieu.nhapDiaChiKhachHang();
        List<String> customerList=new ArrayList<>();
         Customer customer=new Customer(tenKhachHang,ngaySinh,gioiTinh,cmnd,sdt,email,loaiKhach,diaChi);
        customerList.add(customer.toString());
       DocGhiFileCustomer.ghiFile("Customer.CSV",customerList,true);
    }

}
