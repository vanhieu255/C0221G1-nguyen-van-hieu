package models;

public class HocSinh extends ConNguoi {
    private double maLop;

    public HocSinh() {
    }

    public HocSinh(double maLop) {
        this.maLop = maLop;
    }

    public HocSinh(String ten, String ngaySinh, String gioiTinh, int soDienThoai, double maLop) {
        super(ten, ngaySinh, gioiTinh, soDienThoai);
        this.maLop = maLop;
    }

    @Override
    public String toString() {
        return super.toString()+","+maLop;
    }
}
