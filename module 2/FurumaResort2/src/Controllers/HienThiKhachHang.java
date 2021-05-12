package Controllers;

import Commons.DocGhiFile;
import Commons.DocGhiFileCustomer;
import Models.Customer;
import Models.Services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HienThiKhachHang {
    public static void hienThiKhachHang(){
        List<Customer> customerList=new ArrayList<>();
        customerList= DocGhiFileCustomer.docFile("Customer.CSV");
        customerList.sort(Comparator.comparing(Customer::getTenKhachHang));
        for(Customer customer:customerList){
            System.out.println(customer.toString());
        }
    }
}
