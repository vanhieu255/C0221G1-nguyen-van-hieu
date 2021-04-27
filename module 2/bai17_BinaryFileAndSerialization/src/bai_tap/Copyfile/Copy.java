package bai_tap.Copyfile;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
//        File file=new File("source1.txt");
//        if(file.isFile()){
//            System.out.println("file :"+file.getAbsolutePath());
//        }else {
//            System.out.println("not file");
//            file.createNewFile();
//        }

        String file1 = "E:\\code gym\\C0221G1-nguyen-van-hieu\\module 2\\bai17_BinaryFileAndSerialization\\src\\bai_tap\\Copyfile\\source1.txt";
        File file = new File(file1);
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;


        try {
            fileInputStream = new FileInputStream(file1);
            fileOutputStream = new FileOutputStream("E:\\code gym\\C0221G1-nguyen-van-hieu\\module 2\\bai17_BinaryFileAndSerialization\\src\\bai_tap\\Copyfile\\target1.txt");
            int ch;
            while ((ch = fileInputStream.read()) != -1) {
                System.out.print((char) ch);
                fileOutputStream.write(ch);
            }
            System.out.println(file.length());


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }

    }
}
