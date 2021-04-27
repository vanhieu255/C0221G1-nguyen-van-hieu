package bai_tap.Sinhvienluuvaofile;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> studentList=new ArrayList<>();
        int choose ;
        Scanner input = new Scanner(System.in);
        do {
            showMenu();
            choose= Integer.parseInt(input.nextLine());
            switch (choose){
                case 1:
                    System.out.println("nhap so sinh vien can them :");
                    int n= Integer.parseInt(input.nextLine());
                    for( int i=0;i<n;i++){
                        Student std =new Student();
                        std.input();
                        studentList.add(std);
                    }
                    break;
                case 2:
                    System.out.println("nhap id sinh vien can sua :");
                    int id =Integer.parseInt(input.nextLine());
                    for( int i =0; i<studentList.size();i++){
                        if(studentList.get(i).getId()==id){
                            studentList.get(i).edit();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("nhap id sinh vien can xoa :");
                    int deleteID =Integer.parseInt(System.console().readLine());
                    for( int i =0; i<studentList.size();i++){
                        if(studentList.get(i).getId()==deleteID){
                            studentList.remove(i);
                            break;
                        }
                    }
                    break;
                case 4:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            if(o1.getGpa()<o2.getGpa()) {
                                return -1;
                            }
                            return  1;
                        }
                    });
                    for(int i=0;i<studentList.size();i++){
                        studentList.get(i).display();
                    }
                    break;
                case 5:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    });
                    for(int i=0;i<studentList.size();i++) {
                        studentList.get(i).display();
                    }
                    break;
                case 6:
                    for(int i=0;i<studentList.size();i++) {
                        studentList.get(i).display();
                    }
                    break;
                case 7:
                    FileOutputStream fos =null;
                    ObjectOutputStream oos =null;
                    try{
                        fos= new FileOutputStream("student.data");
                        oos= new ObjectOutputStream(fos);
                        oos.writeObject(studentList);

                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                        try {
                            if (fos != null) {
                                fos.close();
                            }
                            if (oos != null) {
                                oos.close();
                            }

                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }

                    break;
                case 8:
                    FileInputStream fis =null;
                    ObjectInputStream ois =null;
                    try{
                        fis= new FileInputStream("student.data");
                        ois= new ObjectInputStream(fis);
                        studentList= (List<Student>) ois.readObject();

                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                        try {
                            if (fis != null) {
                                fis.close();
                            }
                            if (ois != null) {
                                ois.close();
                            }

                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }

                    break;
                case 9:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Nhap fail !!!");


            }


        }while (choose !=9);

    }
    static void showMenu(){
        System.out.println("1.add student");
        System.out.println("2.Edit student by ID");
        System.out.println("3.delete student by ID");
        System.out.println("4.sort student by GPA" );
        System.out.println("5.sort student by name ");
        System.out.println("6.Show student");
        System.out.println("7.Save");
        System.out.println("8.Read");
        System.out.println("9.Exit");
        System.out.println("Choose :");

    }

}
