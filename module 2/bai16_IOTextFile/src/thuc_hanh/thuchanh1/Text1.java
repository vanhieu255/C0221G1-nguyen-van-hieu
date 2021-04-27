package thuc_hanh.thuchanh1;

import java.io.*;

public class Text1 {

    public static void main(String[] args) throws IOException {
        File file = new File("MyFile.txt");
        if (file.isFile()) {
            System.out.println("file :" + file.getAbsolutePath());
        } else {
            System.out.println("not file");
            file.createNewFile();
        }
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter("MyFile.txt", true);
//            writer.write("Xin chào");
//            writer.write("\r\n");
//            writer.write("GoodBye");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (writer != null) {
//                writer.close();
//            }
//        }
//
////               doc ghi file UTF 16
//
//
//        FileOutputStream outputStream =null;
//        OutputStreamWriter outputStreamWriter =null;
//        BufferedWriter bufferedWriter =null;
//        try {
//            outputStream = new FileOutputStream("MyFile.txt");
//             outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
//            bufferedWriter = new BufferedWriter(outputStreamWriter);
//            bufferedWriter.write("xin chào");
//            bufferedWriter.newLine();
//            bufferedWriter.write("hẹn gặp lại");
//
//            bufferedWriter.close();
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        } finally {
//            if (outputStream != null) {
//                outputStream.close();
//            }
//            if (outputStreamWriter != null) {
//                outputStreamWriter.close();
//            }
//            if (bufferedWriter != null) {
//                bufferedWriter.close();
//            }
//        }
//    }





//        try {
//            FileOutputStream outputStream = new FileOutputStream("MyFile.txt");
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
//            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
//
//            bufferedWriter.write("Xin chào");
//            bufferedWriter.newLine();
//            bufferedWriter.write("Hẹn gặp lại!");
//
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}




//        DataInputStream inputStream= new DataInputStream(System.in);
//        System.out.println("Nhap N");
//       int N=Integer.parseInt(inputStream.readLine());
//        System.out.println(N);

        //doc du lieu tu 1 file
//        FileInputStream fileInputStream = new FileInputStream("text.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream("test_cp.txt");
//        try {
//            int ch;
//            while (((ch = fileInputStream.read()) != -1)) {
//                System.out.print((char) ch);
//                break;
////                fileOutputStream.write(ch);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fileInputStream != null) {
//                try {
//                    fileInputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (fileOutputStream != null) {
//                try {
//                    fileOutputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }

//        }
//      next
//        FileReader reader=null;
//        FileWriter writer=null;
//        try{
//            reader=new FileReader("text.txt");
//             writer= new FileWriter("test_cp2.txt");
//            int ch;
//            while ((ch=reader.read())!=-1){
//                System.out.print((char) ch);
//                writer.write(ch);
//            }
//            writer.write("\n Xin chào");
//        } catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            if(reader!=null){
//                reader.close();
//            }
//            if(writer!=null){
//                writer.close();
//            }
//        }
            // next 3
        FileInputStream fileInputStream =null;
        BufferedInputStream bufferedInputStream= null;
        try{
            fileInputStream=new FileInputStream("text.txt");
            bufferedInputStream= new BufferedInputStream(fileInputStream);
            byte[] data= new byte[200];
           bufferedInputStream.read(data);
            String result=new String(data);
            System.out.println(result);



        }catch(IOException e){
            e.printStackTrace();

        }finally {
            if(fileInputStream!=null){
                fileInputStream.close();
            }
            if(bufferedInputStream!=null){
                bufferedInputStream.close();
            }

        }

        }
    }

