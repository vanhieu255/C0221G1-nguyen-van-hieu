package controllers;

import commons.DocGhiFile;
import models.DanhBa;

import java.util.ArrayList;
import java.util.List;

public class XemDanhBa {
    public static void xem(){
        List<DanhBa> danhBaList = new ArrayList<>();
        danhBaList= DocGhiFile.docFile("danh.csv");
        for(DanhBa danhBa: danhBaList){
            if(danhBa instanceof DanhBa){
                System.out.println(danhBa);
            }
        }
    }
}
