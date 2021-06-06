package model.bean;

public class EmployeeDivision {
    private int idBoPhan;
    private String tenBoPhan;

    public EmployeeDivision() {
    }

    public EmployeeDivision(int idBoPhan, String tenBoPhan) {
        this.idBoPhan = idBoPhan;
        this.tenBoPhan = tenBoPhan;
    }

    public int getIdBoPhan() {
        return idBoPhan;
    }

    public void setIdBoPhan(int idBoPhan) {
        this.idBoPhan = idBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }
}
