package Models;

public class CongNhan extends CanBo {
    private String bac;

    public CongNhan() {
    }

    public CongNhan(String bac) {
        this.bac = bac;
    }

    public CongNhan(String ten, String namSinh, String gioiTinh, String diaChi, String bac) {
        super(ten, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    @Override
    public String hienThi() {
        return super.toString() +","+bac;
    }
}
