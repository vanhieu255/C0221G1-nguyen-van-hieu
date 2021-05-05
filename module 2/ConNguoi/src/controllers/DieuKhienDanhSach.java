package controllers;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

//Tạo menu với các chức năng sau:
//1-Hiển thị danh sách học sinh
//2-thêm mới 1 học sinh(Có validate dữ liệu)
//3-xóa 1 học sinh theo danh sách
//4-tìm kiếm học sinh theo tên(tìm tương đối)
public class DieuKhienDanhSach {
    private static Scanner scanner=new Scanner(System.in);
    public static void danhSach(){
        int chon=0;
        do {
            System.out.println("1-Hiển thị danh sách học sinh\n" +
                    "2-thêm mới 1 học sinh(Có validate dữ liệu)\n" +
                    "3-xóa 1 học sinh theo danh sách\n" +
                    "4-tìm kiếm học sinh theo tên(tìm tương đối)\n" +
                    "5-Exit");
            System.out.println("nhap chon :");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    CacPhuongThucDanhSach.hienThi();
                    break;
                case 2:
                    CacPhuongThucDanhSach.themMoi();
                    break;
                case 3:
                   CacPhuongThucDanhSach.xoa();
                    break;
                case 4:
                   CacPhuongThucDanhSach.timKiem();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Nhap sai , nhập lại ");
                    break;
            }
        }while (true);
    }


}
