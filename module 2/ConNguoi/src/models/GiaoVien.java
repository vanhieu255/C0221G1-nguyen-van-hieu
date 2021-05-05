package models;

public class GiaoVien extends ConNguoi{
    private String lop;
    private  double chieuCao;

    public GiaoVien() {
    }

    public GiaoVien(String lop, double chieuCao) {
        this.lop = lop;
        this.chieuCao = chieuCao;
    }

    public GiaoVien(String ten, String ngaySinh, String gioiTinh, int soDienThoai, String lop, double chieuCao) {
        super(ten, ngaySinh, gioiTinh, soDienThoai);
        this.lop = lop;
        this.chieuCao = chieuCao;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public String toString() {
        return   super.toString() +","+ lop + "," + chieuCao ;

    }
}
