package thuc_hanh.thuchanhTinhtongcacsotrongfiletext;

import thuc_hanh.thuchanh3.Test3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TinhTong {
    public void readFileText(String filePath) {
        try {
            File file = new File("Test4.txt");
            if(file.isFile()){
                System.out.println("file :" +file.getAbsolutePath());
            }else {
                System.out.println("not file");
                file.createNewFile();
            }
            FileReader reader= new FileReader("test4.txt");
            BufferedReader br= new BufferedReader(reader);

            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);


        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }

    }
}
