package Controllers;

import Commons.DocGhiFileCustomer;
import Models.Customer;

import java.util.*;

public class HienThiNhanVien {
    public static void HienThiNhanVien() {
        List<String> employeeList = new ArrayList<>();
        employeeList = DocGhiFileCustomer.docEmployee("Employee.csv");
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i=0;i<employeeList.size();i++) {
           map.put((i+1),employeeList.get(i));
        }
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
