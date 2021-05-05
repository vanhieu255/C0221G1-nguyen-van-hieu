package Controllers;

import Commons.DocGhiFile;
import Models.Customer;
import Models.Services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HienThiKhachHang {
    public static void hienThiKhachHang(){
        List<Services> servicesList=new ArrayList<>();
        servicesList= DocGhiFile.docFile("Customer.CSV");
        ArrayList<Customer>customerList=new ArrayList<>();
        for(int i=0;i<servicesList.size();i++){
            if (servicesList.get(i)instanceof Customer){
                customerList.add(((Customer) servicesList.get(i)));
            }
        }
        customerList.sort(Comparator.comparing(Customer::getTenKhachHang));

        for(Customer customer:customerList){
            customer.showInfor();
        }
    }
}
