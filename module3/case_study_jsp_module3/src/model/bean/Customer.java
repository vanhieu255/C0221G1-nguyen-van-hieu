package model.bean;

public class Customer {
    private int idKhachHang;
    private int idLoaiKhach;
    private String tenLoaiKhach;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String soCmnd;
    private String sdt;
    private String email;
    private String diaChi;

    public Customer() {
    }

    public Customer(int idKhachHang, String hoTen) {
        this.idKhachHang = idKhachHang;
        this.hoTen = hoTen;
    }


    public Customer(int idKhachHang, int idLoaiKhach, String hoTen, String gioiTinh, String ngaySinh, String soCmnd, String sdt, String email, String diaChi) {
        this.idKhachHang = idKhachHang;
        this.idLoaiKhach = idLoaiKhach;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soCmnd = soCmnd;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public int getIdLoaiKhach() {
        return idLoaiKhach;
    }

    public void setIdLoaiKhach(int idLoaiKhach) {
        this.idLoaiKhach = idLoaiKhach;
    }

    public String getTenLoaiKhach() {
        return tenLoaiKhach;
    }

    public void setTenLoaiKhach(String tenLoaiKhach) {
        this.tenLoaiKhach = tenLoaiKhach;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoCmnd() {
        return soCmnd;
    }

    public void setSoCmnd(String soCmnd) {
        this.soCmnd = soCmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
