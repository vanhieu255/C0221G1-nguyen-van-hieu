package thuc_hanh.thuchanh2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws IOException {
        List<Student> list=new ArrayList<>();
//        // ghi du lieu
//        list.add(new Student("A","Nam"));
//        list.add(new Student("B","Nam"));
//        list.add(new Student("C","Nam"));
//        FileOutputStream out=null;
//        ObjectOutputStream objectOutputStream=null;
//        try {
//          out = new FileOutputStream("studen.data");
//           objectOutputStream = new ObjectOutputStream(out);
//           objectOutputStream.writeObject(list);
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            if(out!=null){
//                out.close();
//            }
//            if(objectOutputStream!=null){
//                objectOutputStream.close();
//            }
//
//        }


        //doc du lieu
        FileInputStream in =null;
        ObjectInputStream inputStream = null;
        try{
            in =new FileInputStream("studen.data");
            inputStream=new ObjectInputStream(in);

            list= (List<Student>) inputStream.readObject();

        }catch (IOException e){
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(in !=null){
                in.close();
            }
            if(inputStream !=null){
                inputStream.close();
            }
        }
        System.out.println("ket qua :");
        for(int i =0;i<list.size();i++){
            list.get(i).display();
        }



    }

}
