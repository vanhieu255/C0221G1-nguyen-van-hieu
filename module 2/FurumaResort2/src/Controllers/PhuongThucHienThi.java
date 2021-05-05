//package Controllers;
//
//import Commons.DocGhiFile;
//import Models.Services;
//
//import java.util.*;
//
//public class PhuongThucHienThi {
//    public static void hienThiDichVu() {
//        Scanner scanner = new Scanner(System.in);
//        int chon;
//
//        while (true) {
//            System.out.println("1.\tShow all Villa\n" +
//                    "2.\tShow all House\n" +
//                    "3.\tShow all Room\n" +
//                    "4.\tShow All Name Villa Not Duplicate\n" +
//                    "5.\tShow All Name House Not Duplicate\n" +
//                    "6.\tShow All Name Name Not Duplicate\n" +
//                    "7.\tBack to menu\n" +
//                    "8.\tExit\n");
//            System.out.println("nhap lua chon :");
//            chon=Integer.parseInt(scanner.nextLine());
//            switch (chon){
//                case 1:
//                    hienThiVilla();
//                    break;
//                case 2:
//                    hienThiHouse();
//                    break;
//                case 3:
//                    hienThiRoom();
//                    break;
//                case 4:
//                    hienThiVillaNotDuplicate();
//                    break;
//                case 5:
//                    hienThiHouseNotDuplicate();
//                    break;
//                case 6:
//                    hienThiTatCaNotDuplicate();
//                    break;
//                case 7:
//                    return;
//                case 8:
//                    System.exit(0);
//                default:
//                    System.out.println("nhap sai roi , vui long nhap lai");
//            }
//
//        }
//    }
//
//    public static void hienThiTatCaNotDuplicate() {
//
//    }
//
//    public static void hienThiHouseNotDuplicate() {
//        List<Services> houseList =new ArrayList<>();
//        houseList= DocGhiFile.docFile("house.csv");
//        Set<Services> houseList1=new TreeSet<>(houseList);
//        for(Services villa:houseList1){
//            System.out.println(villa.toString());
//        }
//    }
//
//    public static void hienThiVillaNotDuplicate() {
//        List<Services> villaList =new ArrayList<>();
//        villaList= DocGhiFile.docFile("villa.csv");
//        Set<Services> villaList1=new TreeSet<>(villaList);
//        for(Services villa:villaList1){
//            System.out.println(villa.toString());
//        }
//
//    }
//
//    public static void hienThiRoom() {
//        List<Services> roomList =new ArrayList<>();
//        roomList= DocGhiFile.docFile("room.csv");
//        for(Services room :roomList){
//            System.out.println(room.toString());
//        }
//    }
//
//
//    public static void hienThiHouse() {
//        List<Services> houseList =new ArrayList<>();
//        houseList= DocGhiFile.docFile("house.csv");
//        for(Services house :houseList){
//            System.out.println(house.toString());
//        }
//    }
//
//    public static void hienThiVilla() {
//        List<Services> villaList =new ArrayList<>();
//        villaList= DocGhiFile.docFile("villa.csv");
//        for(Services villa :villaList){
//            System.out.println(villa.toString());
//        }
//    }
//
//
//}
