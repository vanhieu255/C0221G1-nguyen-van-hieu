package bai_tap.baitap1;

public class TestMyArrayList {
    static class Student {
        private String name;
        private int id;

        public Student() {
        }

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Student a = new Student("Huy", 1);
        Student b = new Student("Hậu", 2);
        Student c = new Student("Hùng", 3);
        Student d = new Student("Huyền", 4);
        Student e = new Student("Hân", 5);
        Student f = new Student("Hân2", 5);
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
//        studentMyArrayList.add(f, 2);
        studentMyArrayList.size();
//        System.out.println(studentMyArrayList.size());
//      for(int i=0;i< studentMyArrayList.size();i++){
//          Student student = (Student) studentMyArrayList.elements[i];
//          System.out.println(student.getId());
//          System.out.println(student.getName());

//      }
//        System.out.println(studentMyArrayList.get(2).getName());
//    }
//        System.out.println(studentMyArrayList.contains(f));
        newMyArrayList= studentMyArrayList.clone();
        newMyArrayList.remove(0);
        for(int i=0;i<newMyArrayList.size();i++){
            System.out.println(newMyArrayList.get(i).getName());
        }
    }
}
