package Controllers;

import java.util.Scanner;

public class DatDichVU {
    public static void datDichVu(){
        Scanner scanner=new Scanner(System.in);
        int chon;
        while (true){
            System.out.println("1.\tBooking Villa\n" +
                    "2.\tBooking House\n" +
                    "3.\tBooking Room\n" +
                    "4.\tTro lai danh sach\n" +
                    "5.\tThoat");
            System.out.println("nhap chon :");
            chon=Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    CacPhuongThucDatDichVu.datVilla();
                    break;
                case 2:
                    CacPhuongThucDatDichVu.datHouse();
                    break;
                case 3:
                    CacPhuongThucDatDichVu.datRoom();
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
}
