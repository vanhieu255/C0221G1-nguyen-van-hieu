package model.bean;

public class Employee {
    private int idNhanVien;
    private String hoTen;
    private int idViTri;
    private int idTrinhDo;
    private int idBoPhan;
    private String tenViTri;
    private String tenTrinhdo;
    private String tenBoPhan;
    private String ngaySinh;
    private String soCmnd;
    private String luong;
    private String sdt;
    private String email;
    private String diaChi;

    public String getTenViTri() {
        return tenViTri;
    }

    public void setTenViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }

    public String getTenTrinhdo() {
        return tenTrinhdo;
    }

    public void setTenTrinhdo(String tenTrinhdo) {
        this.tenTrinhdo = tenTrinhdo;
    }



    public Employee() {
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public Employee(int idNhanVien, String hoTen, String tenViTri, String tenTrinhdo, String tenBoPhan, String ngaySinh, String soCmnd, String luong, String sdt, String email, String diaChi) {
        this.idNhanVien = idNhanVien;
        this.hoTen = hoTen;
        this.tenViTri = tenViTri;
        this.tenTrinhdo = tenTrinhdo;
        this.tenBoPhan = tenBoPhan;
        this.ngaySinh = ngaySinh;
        this.soCmnd = soCmnd;
        this.luong = luong;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
    }

    public Employee(int idNhanVien, String hoTen, int idViTri, int idTrinhDo, int idBoPhan, String ngaySinh, String soCmnd, String luong, String sdt, String email, String diaChi) {
        this.idNhanVien = idNhanVien;
        this.hoTen = hoTen;
        this.idViTri = idViTri;
        this.idTrinhDo = idTrinhDo;
        this.idBoPhan = idBoPhan;
        this.ngaySinh = ngaySinh;
        this.soCmnd = soCmnd;
        this.luong = luong;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getIdViTri() {
        return idViTri;
    }

    public void setIdViTri(int idViTri) {
        this.idViTri = idViTri;
    }

    public int getIdTrinhDo() {
        return idTrinhDo;
    }

    public void setIdTrinhDo(int idTrinhDo) {
        this.idTrinhDo = idTrinhDo;
    }

    public int getIdBoPhan() {
        return idBoPhan;
    }

    public void setIdBoPhan(int idBoPhan) {
        this.idBoPhan = idBoPhan;
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

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
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
