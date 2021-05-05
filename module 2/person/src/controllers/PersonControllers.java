package controllers;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import commons.DocGhiFile;
import commons.IdDocFile;
import commons.PersonException;
import models.Person;
import models.Students;
import models.Teacher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonControllers {
    static Scanner scanner = new Scanner(System.in);

    public static void hienThi() {
//        List<Person> list = new ArrayList<>();
//        list = DocGhiFile.docFile("person.csv");
//        for (Person person : list) {
//            System.out.println(person);
//        }

        int chon;
        do {
            System.out.println("Chọn :\n" +
                    "1.Hien thi học sinh\n" +
                    "2.hien thi giáo viên\n" +
                    "3.hien thi tất ca \n" +
                    "4.Trở lại menu chính\n" +
                    "5.Thoát");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                  ShowInfo.hienthiHS();
                    break;
                case 2:
                   ShowInfo.hienthiGV();
                    break;
                case 3:
                   ShowInfo.hienthiTatCa();
                   break;
                case 4:
                    return;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("nhap sai roi");
                    break;
            }
        } while (true);

    }

    public static void themMoi() {
        int chon;
        do {
            System.out.println("Chọn :\n" +
                    "1.Thêm học sinh\n" +
                    "2.Thêm giáo viên\n" +
                    "3.Trở lại menu chính\n" +
                    "4.Thoát");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    themHS();
                    break;
                case 2:
                    themGV();
                    break;
                case 3:
                    return;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("nhap sai roi");
                    break;
            }
        } while (true);

    }

    //tring name, String date, String gender, String numberPhone, String idClass)
    public static void themHS() {
        String ten = InputData.nhapTen();
        String date = InputData.nhapDate();
        String gioiTinh = InputData.nhapGioiTinh();
        String number = InputData.nhapNumberPhone();
        String id = InputData.nhapID();
        List<Person> personList = new ArrayList<>();
        Person student = new Students(ten, date, gioiTinh, number, id);
        personList.add(student);
        DocGhiFile.ghiFile("person.csv",personList,true);
    }

    public static void themGV() {
        String ten = InputData.nhapTen();
        String date = InputData.nhapDate();
        String gioiTinh = InputData.nhapGioiTinh();
        String number = InputData.nhapNumberPhone();
        String lop=InputData.nhapLop();
        double chieuCao=InputData.nhapChieucao();

        List<Person> personList = new ArrayList<>();
        Person teacher = new Teacher(ten, date, gioiTinh, number,lop,chieuCao);
        personList.add(teacher);
        DocGhiFile.ghiFile("person.csv",personList,true);

    }

    public static void xoa() {
        List<Person> list = new ArrayList<>();
        list = DocGhiFile.docFile("person.csv");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ": " + list.get(i));
        }
        int chon = Integer.parseInt(scanner.nextLine());
        if (chon <= list.size() && chon >= 0) {
            for (int i = 0; i < list.size(); i++) {
                if (i == (chon - 1)) {
                    list.remove(list.get(i));
                    break;
                }
            }
        } else {
            System.out.println("nhap qua roi");
        }
        DocGhiFile.ghiFile("person.csv", list, false);
    }

    public static void timKiem() {
        System.out.println("nhap tên can tim kiem ");
        String ten1 = scanner.nextLine();
        List<Person> list = new ArrayList<>();
        list = DocGhiFile.docFile("person.csv");
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().contains(ten1)) {
                System.out.println(list.get(i));
                check = true;
            }
        }
        if (check == false) {
            System.out.println("khong tim thay");
        }

    }


}
