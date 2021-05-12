package Commons;

import Models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFileCustomer {
    public static final String PATH = "src/data/";
    public static void ghiFile(String path, List<String> customerList, boolean status) {
        File file =null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(PATH + path);
            fileWriter = new FileWriter(file,status);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String customer : customerList) {
                bufferedWriter.write(customer.toString());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


    public static List<Customer> docFile(String path){
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        List<Customer> customerList = new ArrayList<>();
        String[] str = null;
        try {
            file = new File(PATH+path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                str = line.split(",");
                Customer customer=new Customer(str[0],str[1],str[2],Integer.parseInt(str[3]),Integer.parseInt(str[4]),str[5],str[6],str[7]);
                customerList.add(customer);
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
            return customerList;
        }
    }

    public static List<String> docEmployee(String path){
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        List<String> strings = new ArrayList<>();
        try {
            file = new File(PATH+path);
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

}
