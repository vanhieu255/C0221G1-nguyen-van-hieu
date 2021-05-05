package Controllers;

import Models.CanBo;
import commons.DocGhiFile;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CacPhuongThucDanhSach {
    static Scanner scanner=new Scanner(System.in);
    public static void nhapThongTin(){
        int chon;
        while (true){
            System.out.println("1.Nhap thong tin cong nhan\n" +
                    "2.Nhap thong tin ky su \n" +
                    "3.Nhap thong tin nhan vien\n" +
                    "4.tro lai danh sach" +
                    "5.Thoat");
            System.out.println("nhap chon :");
            chon=Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    CacPhuongThucNhapThongTin.nhapThongTinCongNhan();
                    break;
                case 2:
                    CacPhuongThucNhapThongTin.nhapThongTinKySu();
                    break;
                case 3:
                   CacPhuongThucNhapThongTin.nhapThongTinNhanVien();
                    break;
                case 4:
                    return;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("nhap sai roi ,nhap lai");
            }

        }

    }
    public static void  hienThiThongTin(){
        int chon;
        while (true){
            System.out.println("1.hien thi thong tin cong nhan\n" +
                    "2.hien thi thong tin ky su\n" +
                    "3.hien thi thong tin nhan viên\n" +
                    "4.hien thi thong tin tất cả\n" +
                    "5.quay tro lai danh sách \n" +
                    "6.thoát");
            chon=Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    CacPhuongThucHienThi.hienThiThongTinCongNhan();
                    break;
                case 2:
                  CacPhuongThucHienThi.hienThiThongTinKySu();
                    break;
                case 3:
                   CacPhuongThucHienThi.hienThiThongTinNhanVien();
                    break;
                case 4:
                    CacPhuongThucHienThi.hienThiThongTinTatCa();
                    break;
                case 5:
                    return;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("nhap sai roi , ban nen nhap lai");
            }
        }

    }
    public static void timKiemTheoTen(){
        System.out.println("nhap ten can tim kiem");
        String ten=scanner.nextLine();
        List<CanBo>canBoList=new ArrayList<>();
        canBoList= DocGhiFile.docFile("canbo.csv");
        boolean check=false;
        for(int i=0;i<canBoList.size();i++){
            if(canBoList.get(i).getTen().contains(ten)){
                System.out.println(canBoList.get(i));
                check=true;
            }
        }
        if(check==false){
            System.out.println("khong tim thay");
        }

    }
    public static void sapXepTheoTen(){
        List<CanBo>canBoList=new ArrayList<>();
        canBoList=DocGhiFile.docFile("canbo.csv");
        canBoList.sort(Comparator.comparing(CanBo::getTen));
        for(CanBo canBo:canBoList){
            System.out.println(canBo);
        }
    }
}
