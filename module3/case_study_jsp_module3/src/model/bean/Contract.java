package model.bean;

public class Contract {
    private int idHopDong;
    private int idNhanVien;
    private int idKhachHang;
    private int idDichVu;
    private String ngayLamHopDong;
    private String ngayKetThuc;
    private int tienDatCoc;
    private int tongTien;

    public Contract() {
    }

    public Contract(int idHopDong) {
        this.idHopDong = idHopDong;
    }

    public Contract(int idHopDong, int idNhanVien, int idKhachHang, int idDichVu, String ngayLamHopDong, String ngayKetThuc, int tienDatCoc, int tongTien) {
        this.idHopDong = idHopDong;
        this.idNhanVien = idNhanVien;
        this.idKhachHang = idKhachHang;
        this.idDichVu = idDichVu;
        this.ngayLamHopDong = ngayLamHopDong;
        this.ngayKetThuc = ngayKetThuc;
        this.tienDatCoc = tienDatCoc;
        this.tongTien = tongTien;
    }

    public int getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(int idHopDong) {
        this.idHopDong = idHopDong;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public int getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(int idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(String ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(int tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
}
