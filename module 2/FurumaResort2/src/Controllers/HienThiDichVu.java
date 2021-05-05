package Controllers;

import Commons.DocGhiFile;
import Models.House;
import Models.Services;
import Models.Villa;

import java.util.*;

public class HienThiDichVu {
    public static void hienThiDichVu(){
        Scanner scanner= new Scanner(System.in);
        int chon;
        while (true){
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            chon =Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    hienThiVilla();
                    break;
                case 2 :
                    hienThiHouse();
                    break;
                case 3:
                    hienThiRoom();
                    break;
                case 4:
                    hienThiVillaNotDuplicate();
                    break;
                case 5:
                    hienThiHouseNotDuplicate();
                    break;
                case 6:
                    hienThiRoomNotDuplicate();
                    break;
                case 7:
                    return;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("nhap sai roi , vui long nhap lai");
            }
        }
    }

    public static void hienThiRoomNotDuplicate() {
        List<Services> roomList= DocGhiFile.docFile("room.csv");
        Set<Services> roomList1 =new TreeSet<>(roomList);
        for(Services services: roomList1){
            System.out.println(services.toString());
        }
    }

    public static void hienThiHouseNotDuplicate() {
        List<Services> houseList= DocGhiFile.docFile("house.csv");
        Set<Services> houseList1 =new TreeSet<>(houseList);
        for(Services services: houseList1){
            System.out.println(services.toString());
        }
    }

    public static void hienThiVillaNotDuplicate() {
        List<Services>  villaList= DocGhiFile.docFile("villa.csv");
        Set<Services> villaList1 = new TreeSet<>(villaList);
        for(Services villa:villaList1){
            System.out.println(villa);
        }

    }

    public static void hienThiRoom() {
        List<Services> roomList=new ArrayList<>();
        roomList= DocGhiFile.docFile("room.csv");
        for(Services services :roomList){
            System.out.println(services.toString());
        }
    }


    public static void hienThiHouse() {
        List<Services> houseList=new ArrayList<>();
        houseList= DocGhiFile.docFile("house.csv");
        for(Services services :houseList){
            System.out.println(services.toString());
        }
    }

    public static void hienThiVilla() {
        List<Services> villaList=new ArrayList<>();
        villaList= DocGhiFile.docFile("villa.csv");
        for(Services services :villaList){
            System.out.println(services.toString());
        }
    }

}
