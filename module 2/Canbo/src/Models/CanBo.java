package Models;
//Họ tên, năm sinh, giới tính, địa
//chỉ
public abstract class CanBo {
    private  String ten;
    private  String namSinh;
    private String gioiTinh;
    private  String diaChi;

    public CanBo() {
    }

    public CanBo(String ten, String namSinh, String gioiTinh, String diaChi) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return ten +
                "," + namSinh +
                "," + gioiTinh +
                "," + diaChi;
    }
    public abstract String hienThi();

}
