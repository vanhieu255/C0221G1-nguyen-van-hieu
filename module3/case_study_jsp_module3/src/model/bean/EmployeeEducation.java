package model.bean;

public class EmployeeEducation {
    private int idTrinhDo;
    private String trinhDo;

    public EmployeeEducation() {
    }

    public EmployeeEducation(int idTrinhDo, String trinhDo) {
        this.idTrinhDo = idTrinhDo;
        this.trinhDo = trinhDo;
    }

    public int getIdTrinhDo() {
        return idTrinhDo;
    }

    public void setIdTrinhDo(int idTrinhDo) {
        this.idTrinhDo = idTrinhDo;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }
}
