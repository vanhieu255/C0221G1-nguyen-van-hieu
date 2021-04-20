package bai_tap.baitap1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public  class ProductManager {

     static List<Product> list = new ArrayList<>();
     static Scanner sc = new Scanner(System.in);

    public static void add() {
        System.out.println("Input id");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                while (list.get(i).getId() == id) {
                    System.out.println("Input lai");
                    id = Integer.parseInt(sc.nextLine());
                    i = 0;
                }
            }

        }


        System.out.println("Input name");
        String name = sc.nextLine();
        System.out.println("Input price");
        int price = Integer.parseInt(sc.nextLine());
        Product product = new Product(id, name, price);
//        boolean check=false;
//        if(list.size()==0){
        list.add(product);
//        }else {
//        for(int i=0;i<list.size();i++){
//            if(list.get(i).getId()==product.getId()){
//                check=true;
//                break;
//            }
//        }
//        if(check==true){
//            System.out.println("san pham da co");
//            System.out.println("nhap lai san pham :");
//            System.out.println("Input id");
//            int newId = Integer.parseInt(sc.nextLine());
//            System.out.println("Input name");
//            String newName = sc.nextLine();
//            System.out.println("Input price");
//            int newPrice = Integer.parseInt(sc.nextLine());
//            Product newProduct = new Product(newId, newName, newPrice);
//            list.add(newProduct);
//
//
//        }else {
//            list.add(product);
        hienThi();
//        }
    }


//    }

    public static void hienThi() {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public static void delete(int id) {
        for (Product product : list) {
            if (product.getId() == id) {
                list.remove(product);
                break;
            }
        }
        hienThi();
    }

    public static void edit() {
        System.out.println("nhap id can sua");
        int id = sc.nextInt();
        System.out.println("chon cai ban can sua");
        for (Product product : list) {
            if (product.getId() == id) {
                System.out.println("1.edit id" + "\n" +
                        "2.edit name" + "\n" +
                        "3.edit price" + "\n" +
                        "4.edit");
                int choose = sc.nextInt();
                sc.skip("\\R");
                switch (choose) {
                    case 1:
                        System.out.println("input new id");

                        int newId = sc.nextInt();
                        product.setId(newId);
                        break;
                    case 2:
                        System.out.println("input new name");
                        String newName = sc.nextLine();
                        product.setName(newName);
                        break;
                    case 3:
                        System.out.println("input new price");
                        int newPrice = sc.nextInt();
                        product.setPrice(newPrice);
                        break;
                    case 4:
                        System.out.println("input new id");
                        int newId1 = sc.nextInt();
                        product.setId(newId1);
                        System.out.println("input new name");
                        String newName1 = sc.nextLine();
                        product.setName(newName1);
                        System.out.println("input new price");
                        int newPrice1 = sc.nextInt();
                        product.setPrice(newPrice1);
                        break;
                    default:
                        System.exit(0);

                }

            }
        }
        hienThi();

    }

    public static void seach() {
        System.out.println("nhập ten san pham can tìm");
        String name = sc.nextLine();
        boolean check = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {

                System.out.println(list.get(i));
                check = true;
            }
        }
        if (check == false) {
            System.out.println("không tìm thấy sản phẩm");
        }


    }
    public void tang(){
        list.sort(Comparator.comparing(Product::getPrice));
        hienThi();
    }
    public void giam(){
        list.sort(Comparator.comparing(Product::getPrice).reversed());
        hienThi();
    }
    public static void menu() {
        while (true) {

            System.out.println("Các phương thức" + "\n" + "1.add" + "\n" +
                    "2.delete" + "\n" +
                    "3.edit" + "\n" +
                    "4.search" + "\n" +
                    "5.Exit");
            Scanner sc = new Scanner(System.in);
            System.out.print("chọn phương thức :");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    add();
                    break;
                case 2:
                    System.out.println("nhap id muon xoa");
                    int id = sc.nextInt();
                    delete(id);
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    seach();
                    break;
                case 5:
                    if (list.size() == 0) {
                        System.exit(0);
                    } else {
                        hienThi();
                        System.exit(0);
                    }

            }

        }

    }


}
