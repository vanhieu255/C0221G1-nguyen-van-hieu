package model.bean;

public class CustomerType {
    private int idLoaiKhach;
    private String tenLoaiKhach;

    public CustomerType() {
    }

    public CustomerType(int idLoaiKhach, String tenLoaiKhach) {
        this.idLoaiKhach = idLoaiKhach;
        this.tenLoaiKhach = tenLoaiKhach;
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
}
