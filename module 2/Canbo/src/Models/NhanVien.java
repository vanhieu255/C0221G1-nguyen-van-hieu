package Models;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {
    }


    public NhanVien(String ten, String namSinh, String gioiTinh, String diaChi, String congViec) {
        super(ten, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String hienThi() {
        return super.toString()+","+congViec;
    }
}
