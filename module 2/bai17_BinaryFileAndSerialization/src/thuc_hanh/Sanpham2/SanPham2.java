package thuc_hanh.Sanpham2;

import java.io.Serializable;

public class SanPham2 implements Serializable {
    private int ma;
    private String tenSanpham;
    private String tenHang;
    private  int gia;

    public SanPham2() {
    }

    public SanPham2(int ma, String tenSanpham, String tenHang, int gia) {
        this.ma = ma;
        this.tenSanpham = tenSanpham;
        this.tenHang = tenHang;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenSanpham() {
        return tenSanpham;
    }

    public void setTenSanpham(String tenSanpham) {
        this.tenSanpham = tenSanpham;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham2{" +
                "ma=" + ma +
                ", tenSanpham='" + tenSanpham + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", gia=" + gia +
                '}';
    }



}
