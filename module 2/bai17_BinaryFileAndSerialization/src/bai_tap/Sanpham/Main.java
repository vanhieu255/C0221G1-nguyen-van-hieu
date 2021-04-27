package bai_tap.Sanpham;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        List<Product> list2 = new ArrayList<>();

        int choose;
        Scanner sc = new Scanner(System.in);
        do {
            showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    Product product = new Product();
                    product.add();
                    list.add(product);
                    break;
                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).hienThi();
                    }
                    for(int j=0;j<list2.size();j++){
                        list2.get(j).hienThi();
                    }
                    break;
                case 3:
                    System.out.println("nhap name");
                    boolean check = false;
                    String name = sc.nextLine();
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getNameProduct().equals(name)) {

                            System.out.println(list.get(i));
                            list2.add(list.get(i));

                            check = true;
                        }
                    }
                    if (check == false) {
                        System.out.println("không tìm thấy sản phẩm");
                    }
                    break;
                case 4:

                    FileOutputStream fos = null;
                    ObjectOutputStream oos = null;

                    try {
                       fos = new FileOutputStream("product.data");
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
                    break;
                case 5:
                    FileInputStream fis = null;
                    ObjectInputStream ois = null;

                    try {
                        fis = new FileInputStream("product.data");
                        ois = new ObjectInputStream(fis);
                        list = (List<Product>) ois.readObject();


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

                    break;
                case 6:
                    FileOutputStream fos1 = null;
                    ObjectOutputStream oos1 = null;

                    try {
                        fos1 = new FileOutputStream("E:\\code gym\\C0221G1-nguyen-van-hieu\\module 2\\bai17_BinaryFileAndSerialization\\src\\bai_tap\\Sanpham\\timkiem.txt");
                        oos1 = new ObjectOutputStream(fos1);
                        oos1.writeObject(list2);



                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (fos1 != null) {
                                fos1.close();
                            }
                            if (oos1 != null) {
                                oos1.close();
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 7:
                    FileInputStream fis1 = null;
                    ObjectInputStream ois1 = null;

                    try {
                        fis1 = new FileInputStream("E:\\code gym\\C0221G1-nguyen-van-hieu\\module 2\\bai17_BinaryFileAndSerialization\\src\\bai_tap\\Sanpham\\timkiem.txt");
                        ois1 = new ObjectInputStream(fis1);
                        list2 = (List<Product>) ois1.readObject();


                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (fis1 != null) {
                                fis1.close();
                            }
                            if (ois1 != null) {
                                ois1.close();
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    break;

                case 8:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("nhap sai");

            }
        }
        while (choose!=8);


    }

    private static void showMenu() {
        System.out.println("1.add product");
        System.out.println("2.Hien thi product");
        System.out.println("3.Tim kiem ");
        System.out.println("4.Save add");
        System.out.println("5.Read  add");
        System.out.println("6.Save tim kiem");
        System.out.println("7.Read tim kiem");
        System.out.println("8.Exit");
        System.out.println("Choose :");
    }
}
