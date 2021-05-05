package commons;

import Models.CanBo;
import Models.CongNhan;
import Models.KySu;
import Models.NhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    public static final String PATH ="src/datas/";
    public static void ghiFile(String path, List<CanBo>canBoList,boolean status){
        File file=null;
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            file=new File(PATH+path);
            fileWriter=new FileWriter(file,status);
            bufferedWriter =new BufferedWriter(fileWriter);
            for(CanBo canBo:canBoList){
                bufferedWriter.write(canBo.hienThi());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static List<CanBo> docFile(String path){
        File file=null;
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        List<CanBo> canBoList=new ArrayList<>();
        try {
            file=new File(PATH+path);
            fileReader= new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);

            String line="";
            String[] str=null;
            while ((line=bufferedReader.readLine())!=null){
                str=line.split(",");
                if(line.contains("/7")){
                    CanBo congNhan=new CongNhan(str[0],str[1],str[2],str[3],str[4]);
                    canBoList.add(congNhan);
                }else if(line.contains("PV-")){
                    CanBo nhanVien= new NhanVien(str[0],str[1],str[2],str[3],str[4]);
                    canBoList.add(nhanVien);
                }else if(str.length == 5){
                    CanBo kySu= new KySu(str[0],str[1],str[2],str[3],str[4]);
                    canBoList.add(kySu);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return canBoList;
    }

}
