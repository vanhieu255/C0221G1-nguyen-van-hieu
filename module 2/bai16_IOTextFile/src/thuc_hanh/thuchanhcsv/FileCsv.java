package thuc_hanh.thuchanhcsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCsv {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.csv");
        if(file.isFile()){
            System.out.println("file :"+file.getAbsolutePath());
        }else {
            System.out.println("not file");
            file.createNewFile();
        }
        String line ="";
        try{
            BufferedReader br=new BufferedReader(new FileReader(file));
            while ((line =br.readLine())!=null&& !line.isEmpty()){
                String fields[] =line.split(",");
                System.out.println("country="+fields[5]);

            }
            br.close();


        }catch (Exception e){
            e.printStackTrace();

        }


    }


}
