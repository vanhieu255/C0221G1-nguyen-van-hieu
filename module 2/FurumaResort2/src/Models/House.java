package Models;

public class House extends Services implements Comparable<House>{
//Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
private String tieuChuanPhong;
    private String moTaTienNghi;
    private int soTang;

    public House() {
    }

    public House(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanPhong, String moTaTienNghi, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
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

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString()+","+ tieuChuanPhong +
                "," + moTaTienNghi +
                "," + soTang;
    }

    @Override
    public void showInfor() {
        System.out.println("House{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTaTienNghi='" + moTaTienNghi + '\'' +
                ", soTang=" + soTang +
                '}'+super.toString());
    }

    @Override
    public int compareTo(House o) {
        if (this.getTenDichVu().compareTo(o.getTenDichVu()) > 0){
            return 1;
        } else if (this.getTenDichVu().compareTo(o.getTenDichVu()) < 0){
            return -1;
        } else {
            return 0;
        }
    }


}
