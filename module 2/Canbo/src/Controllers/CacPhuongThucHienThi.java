package Controllers;

import Models.CanBo;
import Models.CongNhan;
import Models.KySu;
import Models.NhanVien;
import commons.DocGhiFile;

import java.util.ArrayList;
import java.util.List;

public class CacPhuongThucHienThi {
    public static void hienThiThongTinCongNhan(){
        List<CanBo> canBoList=new ArrayList<>();
        canBoList= DocGhiFile.docFile("canbo.csv");
        for(CanBo canBo:canBoList){
            if(canBo instanceof CongNhan){
                System.out.println(canBo.hienThi());
            }
        }
    }

    public static void hienThiThongTinKySu(){
        List<CanBo> canBoList=new ArrayList<>();
        canBoList= DocGhiFile.docFile("canbo.csv");
        for(CanBo canBo:canBoList){
            if(canBo instanceof KySu){
                System.out.println(canBo.hienThi());
            }
        }
    }

    public static void hienThiThongTinNhanVien(){
        List<CanBo> canBoList=new ArrayList<>();
        canBoList= DocGhiFile.docFile("canbo.csv");
        for(CanBo canBo:canBoList){
            if(canBo instanceof NhanVien){
                System.out.println(canBo.hienThi());
            }
        }
    }

    public static void hienThiThongTinTatCa(){
        List<CanBo> canBoList=new ArrayList<>();
        canBoList= DocGhiFile.docFile("canbo.csv");
        for(CanBo canBo:canBoList){
            System.out.println(canBo.hienThi());
            }
        }




}
