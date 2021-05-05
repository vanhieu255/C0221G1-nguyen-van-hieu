package controllers;

import commons.DocGhiFile;
import models.Person;
import models.Students;
import models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class ShowInfo {
    public static void hienthiHS() {
        List<Person> list = new ArrayList<>();


        list = DocGhiFile.docFile("person.csv");
        for (Person person : list) {
            if (person instanceof Students) {
                System.out.println(person);
            }
        }
    }


    public static void hienthiGV() {
        List<Person> list = new ArrayList<>();


        list = DocGhiFile.docFile("person.csv");
        for (Person person:list){
            if(person instanceof Teacher){
                System.out.println(person);
            }
        }

    }

    public static void hienthiTatCa() {
        List<Person> list = new ArrayList<>();
        list = DocGhiFile.docFile("person.csv");
        for (Person person : list) {
            System.out.println(person);
        }

    }

}
