package model.bean;

public class ServiceTypeRent {
    private int idKieuThue;
    private String tenKieuThue;
    private int gia;

    public ServiceTypeRent() {
    }

    public ServiceTypeRent(int idKieuThue, String tenKieuThue) {
        this.idKieuThue = idKieuThue;
        this.tenKieuThue = tenKieuThue;
    }

    public ServiceTypeRent(int idKieuThue, String tenKieuThue, int gia) {
        this.idKieuThue = idKieuThue;
        this.tenKieuThue = tenKieuThue;
        this.gia = gia;
    }

    public int getIdKieuThue() {
        return idKieuThue;
    }

    public void setIdKieuThue(int idKieuThue) {
        this.idKieuThue = idKieuThue;
    }

    public String getTenKieuThue() {
        return tenKieuThue;
    }

    public void setTenKieuThue(String tenKieuThue) {
        this.tenKieuThue = tenKieuThue;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
