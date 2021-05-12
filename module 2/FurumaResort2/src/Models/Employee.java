package Models;

public class Employee {
    //Họ tên Employee ,tuổi , địa chỉ và phương thức toString().
    private String tenNhanVien;
    private int tuoiNhanVien;
    private String diaChiNhanVien;

    public Employee() {
    }

    public Employee(String tenNhanVien, int tuoiNhanVien, String diaChiNhanVien) {
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.diaChiNhanVien = diaChiNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public void setTuoiNhanVien(int tuoiNhanVien) {
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public String getDiaChiNhanVien() {
        return diaChiNhanVien;
    }

    public void setDiaChiNhanVien(String diaChiNhanVien) {
        this.diaChiNhanVien = diaChiNhanVien;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "tenNhanVien='" + tenNhanVien + '\'' +
                ", tuoiNhanVien=" + tuoiNhanVien +
                ", diaChiNhanVien='" + diaChiNhanVien + '\'' +
                '}';
    }

}
