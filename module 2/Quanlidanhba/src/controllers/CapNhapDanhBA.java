package controllers;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import commons.DocGhiFile;
import models.DanhBa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CapNhapDanhBA {
    public static Scanner scanner=new Scanner(System.in);
    public static void capNhap(){
        System.out.println("nhap số điện thoại ");
        int soDienThoai1=Integer.parseInt(scanner.nextLine());
        List<DanhBa> danhBaList=new ArrayList<>();
        danhBaList= DocGhiFile.docFile("danh.csv");
        boolean check= false;
        for(int i=0;i<danhBaList.size();i++){
            if(danhBaList.get(i).getSoDienThoai()==(soDienThoai1)){
                check=true;
                break;
            }
        }
        if(check==false){
            System.out.println("không tìm thấy số điện thoại");
        }

        System.out.println("Cac thong tin cho phep sua :\n" +
                "1. Nhóm của danh bạ\n" +
                "2.Họ tên \n" +
                "3.gioi tinh\n" +
                "4.dia chi \n" +
                "5.ngay sinh\n" +
                "6.email");


    }




}
