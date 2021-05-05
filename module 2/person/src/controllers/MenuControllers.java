package controllers;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class MenuControllers {
    private static Scanner scanner=new Scanner(System.in);
    public static void menu(){
        int choose;

        do {
            System.out.println("1-Hiển thị danh sách học sinh\n" +
                    "2-thêm mới \n" +
                    "3-xóa 1 học sinh theo danh sách\n" +
                    "4-tìm kiếm học sinh theo tên(tìm tương đối)\n" +
                    "5-thoát");
            System.out.println("nhap choose");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                   PersonControllers.hienThi();
                    break;
                case 2:
                  PersonControllers.themMoi();
                    break;
                case 3:
                   PersonControllers.xoa();
                    break;
                case 4:
                    PersonControllers.timKiem();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("NHAP SAI RỒI LO NHẬP LAI ĐI");
                    break;
            }
        }while (true);

    }

}
