package thuc_hanh.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
     private String name;
     private int age;

     public Student() {
     }

     public Student(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';

     }

     public static void main(String[] args) {
         Student a=new Student("lan",13);
         Student b=new Student("hue",12);
         Student c=new Student("le",14);
         Student d=new Student("anh",20);
         List<Student> list=new ArrayList<>();
         list.add(a);
         list.add(b);
         list.add(c);
         list.add(d);
         list.sort(Comparator.comparing(Student::getAge).reversed());
         System.out.println(list);
     }
      }