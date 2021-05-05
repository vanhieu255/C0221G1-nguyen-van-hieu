package Models;

public class DichVuDiKem {
//Tên dịch vụ đi kèm, Đơn vị, Giá tiền
    private String tenDichVuDiKem;
    private double donVi;
    private double giaTien;

    public DichVuDiKem() {
    }

    public DichVuDiKem(String tenDichVuDiKem, double donVi, double giaTien) {
        this.tenDichVuDiKem = tenDichVuDiKem;
        this.donVi = donVi;
        this.giaTien = giaTien;
    }

    public String getTenDichVuDiKem() {
        return tenDichVuDiKem;
    }

    public void setTenDichVuDiKem(String tenDichVuDiKem) {
        this.tenDichVuDiKem = tenDichVuDiKem;
    }

    public double getDonVi() {
        return donVi;
    }

    public void setDonVi(double donVi) {
        this.donVi = donVi;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return  tenDichVuDiKem +
                "," + donVi +
                "," + giaTien ;
    }
}
