package thuc_hanh.Sanpham2;

import bai_tap.Sanpham.Product;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySanPham {
    List<SanPham2> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void add() {
        System.out.println("Nhap ma :");
        int ma = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten san pham :");
        String tenSanpham = sc.nextLine();
        System.out.println("Nhap ten hang");
        String tenHang = sc.nextLine();
        System.out.println("Nhap gia");
        int gia = Integer.parseInt(sc.nextLine());
        SanPham2 sanPham2 = new SanPham2(ma, tenSanpham, tenHang, gia);
        list.add(sanPham2);
    }

    public void hienThi() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public void timKiem() {
        System.out.println("nhap name");
        String name = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTenHang().equals(name)) {
                System.out.println(list.get(i));
                check = true;
            }
        }
        if (check == false) {
            System.out.println("không tìm thấy sản phẩm");
        }
    }

    public void save(String path, List<SanPham2> list) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (oos != null) {
                    oos.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void read(String path) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            list = (List<SanPham2>) ois.readObject();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (ois != null) {
                    ois.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void menu() {
        while (true) {
            System.out.println("các phương thức ");
            System.out.println("1.add");
            System.out.println("2.hienThi");
            System.out.println("3.tim kiem");
            System.out.println("4.Save");
            System.out.println("5.Read");
            System.out.println("6.Exit");
            Scanner sc = new Scanner(System.in);
            System.out.print("chọn phương thức :");
            int num = Integer.parseInt(sc.nextLine());

            switch (num) {
                case 1:
                    add();
                    break;
                case 2:
                    hienThi();
                    break;
                case 3:
                    timKiem();
                case 4:
                    save("E:\\code gym\\C0221G1-nguyen-van-hieu\\module 2\\bai17_BinaryFileAndSerialization\\src\\thuc_hanh\\Sanpham2\\text.txt", list);
                    break;
                case 5:
                    read("E:\\code gym\\C0221G1-nguyen-van-hieu\\module 2\\bai17_BinaryFileAndSerialization\\src\\thuc_hanh\\Sanpham2\\text.txt");


            }
        }


    }


}
