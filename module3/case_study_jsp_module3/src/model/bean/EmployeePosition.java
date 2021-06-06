package model.bean;

public class EmployeePosition {
    private int idViTri;
    private String tenViTri;

    public EmployeePosition() {
    }

    public EmployeePosition(int idViTri, String tenViTri) {
        this.idViTri = idViTri;
        this.tenViTri = tenViTri;
    }

    public int getIdViTri() {
        return idViTri;
    }

    public void setIdViTri(int idViTri) {
        this.idViTri = idViTri;
    }

    public String getTenViTri() {
        return tenViTri;
    }

    public void setTenViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }
}
