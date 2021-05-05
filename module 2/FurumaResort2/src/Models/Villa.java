package Models;

public class Villa extends Services implements Comparable<Villa> {
    //Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
    private String tieuChuanPhong;
    private String moTaTienNghi;
    private double dienTichHoBoi;
    private int soTang;

    public Villa() {
    }

    public Villa(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanPhong, String moTaTienNghi, double dienTichHoBoi, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghi() {
        return moTaTienNghi;
    }

    public void setMoTaTienNghi(String moTaTienNghi) {
        this.moTaTienNghi = moTaTienNghi;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return  super.toString()+","+tieuChuanPhong +
                "," + moTaTienNghi +
                "," + dienTichHoBoi +
                "," + soTang;
    }

    @Override
    public void showInfor() {
        System.out.println("Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTaTienNghi='" + moTaTienNghi + '\'' +
                ", dienTichHoBoi=" + dienTichHoBoi +
                ", soTang=" + soTang +
                '}'+super.toString());
    }

    @Override
    public int compareTo(Villa o) {
        if (this.getTenDichVu().compareTo(o.getTenDichVu()) > 0){
            return 1;
        } else if (this.getTenDichVu().compareTo(o.getTenDichVu()) < 0){
            return -1;
        } else {
            return 0;
        }
    }
}
