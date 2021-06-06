package model.bean;

public class Service {
    private int idDichVu;
    private String tenDichVu;
    private int dienTich;
    private int soTang;
    private String soNguoiToiDa;
    private String chiPhiThue;
    private int idKieuThue;
    private int idLoaiDichVu;
    private String tieuChuanPhong;
    private String tienNghiKhac;
    private double dienTichHoBoi;

    public Service() {
    }

    public Service(int idDichVu, String tenDichVu, int dienTich, int soTang, String soNguoiToiDa, String chiPhiThue, int idKieuThue, int idLoaiDichVu, String tieuChuanPhong, String tienNghiKhac, double dienTichHoBoi) {
        this.idDichVu = idDichVu;
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.soTang = soTang;
        this.soNguoiToiDa = soNguoiToiDa;
        this.chiPhiThue = chiPhiThue;
        this.idKieuThue = idKieuThue;
        this.idLoaiDichVu = idLoaiDichVu;
        this.tieuChuanPhong = tieuChuanPhong;
        this.tienNghiKhac = tienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(int idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public String getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(String soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getIdKieuThue() {
        return idKieuThue;
    }

    public void setIdKieuThue(int idKieuThue) {
        this.idKieuThue = idKieuThue;
    }

    public int getIdLoaiDichVu() {
        return idLoaiDichVu;
    }

    public void setIdLoaiDichVu(int idLoaiDichVu) {
        this.idLoaiDichVu = idLoaiDichVu;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getTienNghiKhac() {
        return tienNghiKhac;
    }

    public void setTienNghiKhac(String tienNghiKhac) {
        this.tienNghiKhac = tienNghiKhac;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }
}
