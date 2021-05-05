package commons;

import models.Person;
import models.Students;
import models.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    public static final String PATH = "src/data/";

    public static void ghiFile(String path, List<Person> personList, boolean status)  {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(PATH + path);
            fileWriter = new FileWriter(file, status);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Person person : personList) {
                bufferedWriter.write(person.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static List<String> docFileString(String path) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        java.lang.String line = "";
        List<String> strings = null;
        try {
            file = new File(PATH + path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return strings;
        }
    }

    public static List<Person> docFile(String path) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        List<Person> personList = new ArrayList<>();
        String[] str = null;
        try {
            file = new File(PATH + path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                str = line.split(",");
                if (str.length == 5) {
                    Person student = new Students(str[0], str[1], str[2], str[3], str[4]);
                    personList.add(student);
                } else if (str.length == 6) {
                    Person teacher = new Teacher(str[0], str[1], str[2], str[3], str[4], Double.parseDouble(str[5]));
                    personList.add(teacher);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return personList;

    }
}
