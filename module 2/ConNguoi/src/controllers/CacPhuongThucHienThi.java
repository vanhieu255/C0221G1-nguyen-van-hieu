package controllers;

import commons.DocGhiFile;
import models.ConNguoi;
import models.GiaoVien;
import models.HocSinh;

import java.util.ArrayList;
import java.util.List;

public class CacPhuongThucHienThi {
    public static void hienThiHocSinh(){
        List<ConNguoi> conNguoiList = new ArrayList<>();
        conNguoiList= DocGhiFile.docFile("connguoi.csv");
      for(ConNguoi conNguoi: conNguoiList){
          if(conNguoi instanceof HocSinh){
              System.out.println(conNguoi);
          }
        }
    }

    public static void hienThiGiaoVien(){
        List<ConNguoi> conNguoiList = new ArrayList<>();
        conNguoiList= DocGhiFile.docFile("connguoi.csv");
        for(int i=0;i<conNguoiList.size();i++){
            if(conNguoiList.get(i)instanceof GiaoVien){
                System.out.println(conNguoiList.get(i).toString());
            }
        }
    }

    public static void hienThiTatCa(){
        List<ConNguoi> conNguoiList = new ArrayList<>();
        conNguoiList=DocGhiFile.docFile("connguoi.csv");
        for(ConNguoi conNguoi:conNguoiList){
            System.out.println(conNguoi);
        }
    }


}
