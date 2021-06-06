package model.bean;

public class ServiceType {
    private int idLoaiDichVu;
    private String tenLoaiDichVu;

    public ServiceType() {
    }

    public ServiceType(int idLoaiDichVu, String tenLoaiDichVu) {
        this.idLoaiDichVu = idLoaiDichVu;
        this.tenLoaiDichVu = tenLoaiDichVu;
    }

    public int getIdLoaiDichVu() {
        return idLoaiDichVu;
    }

    public void setIdLoaiDichVu(int idLoaiDichVu) {
        this.idLoaiDichVu = idLoaiDichVu;
    }

    public String getTenLoaiDichVu() {
        return tenLoaiDichVu;
    }

    public void setTenLoaiDichVu(String tenLoaiDichVu) {
        this.tenLoaiDichVu = tenLoaiDichVu;
    }
}
