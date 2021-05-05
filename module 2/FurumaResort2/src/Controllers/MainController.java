package Controllers;

import java.util.Scanner;

public class MainController {
    public static void displayMainMenu(){
        Scanner scanner=new Scanner(System.in);
        int chon;
        while (true){
            System.out.println("1.\t Add New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n");
            System.out.println("nhap chon :");
            chon=Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    PhuongThucThemDichVu.themDichVu();
                    break;
                case 2:
                    HienThiDichVu.hienThiDichVu();
                    break;
                case 3:
                    PhuongThucThemKhachHang.themKhachHang();
                    break;
                case 4:
                    HienThiKhachHang.hienThiKhachHang();
                    break;
                case 5:
                    themDat();
//                    break;
//                case 6:
//                    hienThiThongTinNhanVien();
//                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Nhap sai roi , vui long nhap lai");
            }
        }

    }

}
