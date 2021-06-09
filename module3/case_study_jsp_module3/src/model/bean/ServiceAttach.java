package model.bean;

public class ServiceAttach {
    private int idDichVuDiKem;
    private String tenDichVuDiKem;

    public ServiceAttach() {
    }

    public ServiceAttach(int idDichVuDiKem, String tenDichVuDiKem) {
        this.idDichVuDiKem = idDichVuDiKem;
        this.tenDichVuDiKem = tenDichVuDiKem;
    }

    public int getIdDichVuDiKem() {
        return idDichVuDiKem;
    }

    public void setIdDichVuDiKem(int idDichVuDiKem) {
        this.idDichVuDiKem = idDichVuDiKem;
    }

    public String getTenDichVuDiKem() {
        return tenDichVuDiKem;
    }

    public void setTenDichVuDiKem(String tenDichVuDiKem) {
        this.tenDichVuDiKem = tenDichVuDiKem;
    }
}
