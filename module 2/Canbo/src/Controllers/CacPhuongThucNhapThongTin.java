package Controllers;

import Models.CanBo;
import Models.CongNhan;
import Models.KySu;
import Models.NhanVien;
import commons.BatLoi;
import commons.DocGhiFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Họ tên, năm sinh, giới tính, địa
//chỉ
public class CacPhuongThucNhapThongTin {
    public static Scanner scanner = new Scanner(System.in);

    public static void nhapThongTinCongNhan() {
        System.out.println("nhap ten :");
        String ten = scanner.nextLine();
        System.out.println("nhap nam sinh :");
        String namSinh = scanner.nextLine();
        System.out.println("nhap nam gioi tinh :");
        String gioiTinh = scanner.nextLine();
        System.out.println("nhap dia chi :");
        String diaChi = scanner.nextLine();

        String bac = null;
        while (true) {
            try {
                System.out.println("nhap bậc");
                bac = scanner.nextLine();
                BatLoi.kiemTraBac(bac);
                break;
            } catch (BatLoi batLoi) {
                System.out.println(batLoi.getMessage());
            }


            List<CanBo> canBoList = new ArrayList<>();
            canBoList.add(new CongNhan(ten, namSinh, gioiTinh, diaChi, bac));
            DocGhiFile.ghiFile("canbo.csv", canBoList, true);
        }
    }
        public static void nhapThongTinKySu(){

            List<String> list = new ArrayList<>();

            System.out.println("nhap ten :");
            String ten = scanner.nextLine();
            System.out.println("nhap nam sinh :");
            String namSinh = scanner.nextLine();
            System.out.println("nhap nam gioi tinh :");
            String gioiTinh = scanner.nextLine();
            System.out.println("nhap dia chi :");
            String diaChi = scanner.nextLine();
            System.out.println("nhap nganh");


            try {
                File file = new File("src/datas/nganhdaotao.csv");
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    list.add(line);

                }
                String a = scanner.nextLine();
                String nganh = null;

                for (int i = 0; i < list.size(); i++) {
                    if (a.contains(list.get(i).split("-")[0])) {
                        nganh = list.get(i);
                    }
                }
                List<CanBo> canBoList = new ArrayList<>();
                canBoList.add(new KySu(ten, namSinh, gioiTinh, diaChi, nganh));
                DocGhiFile.ghiFile("canbo.csv", canBoList, true);


                bufferedReader.close();
                fileReader.close();


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        public static void nhapThongTinNhanVien () {
            System.out.println("nhap ten :");
            String ten = scanner.nextLine();
            System.out.println("nhap nam sinh :");
            String namSinh = scanner.nextLine();
            System.out.println("nhap  gioi tinh :");
            String gioiTinh = scanner.nextLine();
            System.out.println("nhap dia chi :");
            String diaChi = scanner.nextLine();
            System.out.println("nhap cong viec :");
            String congViec = scanner.nextLine();
            List<CanBo> canBoList = new ArrayList<>();
            canBoList.add(new NhanVien(ten, namSinh, gioiTinh, diaChi, congViec));
            DocGhiFile.ghiFile("canbo.csv", canBoList, true);


        }


    }
