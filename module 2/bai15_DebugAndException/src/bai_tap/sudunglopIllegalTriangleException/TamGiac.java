package bai_tap.sudunglopIllegalTriangleException;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TamGiac {
    public static void kiemTra(double x, double y, double z) throws IllegalTriangleException {
        if (x < 0 || y < 0 || z < 0 || (x + y) < z || (x + z) < y || (y + z) < x)
            throw new IllegalTriangleException("loi");
        else {
            System.out.println("la ba canh cua tam giac");
        }
    }

    public static void main(String[] args) throws IllegalTriangleException {

        while (true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Nhap 3 canh cua tam giac");
                System.out.println("nhap canh 1");
                double a = sc.nextDouble();
                System.out.println("nhap canh 2");
                double b = sc.nextDouble();
                System.out.println("nhap canh 3");
                double c = sc.nextDouble();
                kiemTra(a, b, c);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("khong phai la ba canh 1 tam giac");
            } catch (InputMismatchException e){
                System.out.println("ko dc nhap chu cai");

            }

        }
    }
}


