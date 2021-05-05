package models;
//ạo abstract person với 2 lớp kế thừa teacher và student;
//Lớp student với các thuộc tính.
//Tên, ngày sinh, giới tính , số điện thoại, mã lớp.
public abstract class ConNguoi {
    protected String ten;
    protected String ngaySinh;
    protected String gioiTinh;
    protected int soDienThoai;

    public ConNguoi() {
    }

    public ConNguoi(String ten, String ngaySinh, String gioiTinh, int soDienThoai) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return  ten +","+ ngaySinh +"," + gioiTinh + "," +soDienThoai ;

    }
}
