package controllers;

import commons.DocGhiFile;
import models.ConNguoi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CacPhuongThucDanhSach {
    private static Scanner scanner=new Scanner(System.in);
    public static void hienThi(){
        int chon;
        while (true) {
            System.out.println("1.Hien thi sinh vien\n" +
                    "2.Hien thi giao vien\n" +
                    "3.Hien thi tat ca\n" +
                    "4.tro lai danh sách\n" +
                    "5.thoát");
            System.out.println("nhap chon :");
            chon=Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                   CacPhuongThucHienThi.hienThiHocSinh();
                    break;
                case 2:
                    CacPhuongThucHienThi.hienThiGiaoVien();
                    break;
                case 3:
                    CacPhuongThucHienThi.hienThiTatCa();
                    break;
                case 4:
                    return;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("nhap sai rồi ");
                    break;
            }
        }



    }
    public static void themMoi(){
        int chon;
        do {
            System.out.println("1.them hoc sinh\n" +
                    "2.them giao vien\n" +
                    "3.tro lai danh sách chính\n" +
                    "4.thoát");
            chon=Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    CacPhuongThucThemMoi.themHocSinh();
                    break;
                case 2:
                   CacPhuongThucThemMoi.themGiaoVien();
                    break;
                case 3:
                    return;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Nhap sai rồi , ban nên nhập lại");
                    break;
            }
        }while (true);


    }
    public static void xoa(){
        List<ConNguoi> conNguoiList=new ArrayList<>();
        conNguoiList= DocGhiFile.docFile("connguoi.csv");
        for(int i=0;i<conNguoiList.size();i++){
            System.out.println((i+1)+"."+conNguoiList.get(i));
        }
        System.out.println("nhap chon để xóa :");
        int chon=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<conNguoiList.size();i++){
            if(i==(chon-1)){
                conNguoiList.remove(i);
                break;
            }
        }
        DocGhiFile.ghiFile("connguoi.csv",conNguoiList,false);

    }

    public static void timKiem(){
        System.out.println("nhap tên cần tìm kiếm :");
        String ten=scanner.nextLine();
        List<ConNguoi> conNguoiList=new ArrayList<>();
        conNguoiList= DocGhiFile.docFile("connguoi.csv");
        boolean check=false;
        for(int i=0;i<conNguoiList.size();i++){
           if(conNguoiList.get(i).getTen().contains(ten)){
                System.out.println(conNguoiList.get(i));
               check = true;
           }
        }
        if(!check){
            System.out.println("khong tim thấy");
        }


    }
}
