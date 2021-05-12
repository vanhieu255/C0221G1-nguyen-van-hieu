package commons;

import models.DanhBa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    public static final String PATH = "src/data/";


    public static void ghiFile(String path, List<DanhBa> danhBaList, boolean status) {
        File file =null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(PATH + path);
            fileWriter = new FileWriter(file,status);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (DanhBa danhBa : danhBaList) {
                bufferedWriter.write(danhBa.toString());
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

    public static List<DanhBa> docFile(String path) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        List<DanhBa> danhBaList = new ArrayList<>();
        String[] str = null;
        try {
            file = new File(PATH + path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                str = line.split(",");
                if (str.length == 7) {
                    DanhBa danhBa = new DanhBa(Integer.parseInt(str[0]),Integer.parseInt(str[1]), str[2], str[3], str[4],str[5],str[6]);
                    danhBaList.add(danhBa);
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
        return danhBaList;

    }
}
