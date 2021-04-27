package bai_tap.Copyfiletext;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\code gym\\C0221G1-nguyen-van-hieu\\module 2\\bai16_IOTextFile\\src\\bai_tap\\Copyfiletext\\source.txt");
        File file2 = new File("E:\\code gym\\C0221G1-nguyen-van-hieu\\module 2\\bai16_IOTextFile\\src\\bai_tap\\Copyfiletext\\target.txt");
        if (file.isFile() && file2.isFile()) {
            System.out.println("file:" + file.getAbsolutePath() + "file2 :" + file2.getAbsolutePath());
        } else {
            System.out.println("tep nguon khong ton tai hoac tep dich da ton tai");
            file.createNewFile();
            file2.createNewFile();
        }

        FileOutputStream outputStream = new FileOutputStream("E:\\code gym\\C0221G1-nguyen-van-hieu\\module 2\\bai16_IOTextFile\\src\\bai_tap\\Copyfiletext\\source.txt");
        String s = "hello dsacvcx dsadsadsacaaa";
        outputStream.write(s.getBytes());


        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader(file);
            writer = new FileWriter(file2);
            int ch;
            while ((ch=reader.read())!=-1){
                System.out.print((char) ch);
                writer.write(ch);
            }



        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if ( reader != null) {
                reader.close();
            }
            if(writer != null){
                writer.close();
            }

        }
        }

    }
