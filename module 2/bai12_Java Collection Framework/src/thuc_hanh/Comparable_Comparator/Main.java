package thuc_hanh.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("hải",19));
        studentList.add(new Student("Abc",18));
        studentList.add(new Student("Xyz",17));

//
//        Collections.sort(studentList);



//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        for(Student student: studentList){
            System.out.println(student);
        }

    }


}
