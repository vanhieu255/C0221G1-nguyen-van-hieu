package Controllers;

import Commons.DocGhiFile;
import Models.Services;

import java.util.ArrayList;
import java.util.List;

public class CacPhuongThucDatDichVu {
    public static void datVilla(){
        while (true){
        List<Services> villaList=new ArrayList<>();
        villaList= DocGhiFile.docFile("villa.csv");
        for(int i=0;i<villaList.size();i++){
            System.out.println((i + 1) +"." + villaList.get(i));
        }


    }
    public static void datHouse(){
        List<Services> houseList=new ArrayList<>();
        houseList= DocGhiFile.docFile("house.csv");
        for(Services services :houseList){
            System.out.println(services.toString());
        }

    }
    public static void datRoom(){
        List<Services> roomList=new ArrayList<>();
        roomList= DocGhiFile.docFile("room.csv");
        for(Services services :roomList){
            System.out.println(services.toString());
        }
    }

}
