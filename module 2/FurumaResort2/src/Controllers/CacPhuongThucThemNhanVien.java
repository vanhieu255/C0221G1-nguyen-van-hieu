package Controllers;

import Commons.DocGhiFile;
import Commons.DocGhiFileCustomer;
import Models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CacPhuongThucThemNhanVien {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten nhan vien :");
        String tenNhanVien=scanner.nextLine();
        System.out.println("nhap tuoi nhan vien :");
        int tuoi=Integer.parseInt(scanner.nextLine());
        System.out.println("nhap dia chi nhan vien :");
        String diaChiNhanVien=scanner.nextLine();
        Employee employee=new Employee(tenNhanVien,tuoi,diaChiNhanVien);
        List<String>list=new ArrayList<>();
        list.add(employee.toString());
        DocGhiFileCustomer.ghiFile("Employee.csv",list,true);
    }
}
