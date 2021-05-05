package commons;

import models.ConNguoi;
import models.GiaoVien;
import models.HocSinh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    public static final String PATH = "src/data/";


    public static void ghiFile(String path, List<ConNguoi> conNguoiList, boolean status) {
        File file =null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(PATH + path);
            fileWriter = new FileWriter(file,status);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (ConNguoi conNguoi : conNguoiList) {
                bufferedWriter.write(conNguoi.toString());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public static List<ConNguoi> docFile(String path) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        List<ConNguoi> conNguoiList = new ArrayList<>();
        String[] str = null;
        try {
            file = new File(PATH + path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                str = line.split(",");
                if (str.length == 5) {
                    ConNguoi hocSinh = new HocSinh(str[0], str[1], str[2], Integer.parseInt(str[3]), Double.parseDouble(str[4]));
                    conNguoiList.add(hocSinh);

                } else if (str.length == 6) {
                    ConNguoi giaoVien = new GiaoVien(str[0], str[1], str[2], Integer.parseInt(str[3]), str[4], Double.parseDouble(str[5]));
                    conNguoiList.add(giaoVien);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return conNguoiList;

    }
}
