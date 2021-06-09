package model.bean;

public class ContractDetail {
    private int idHopDongChiTiet;
    private int idHopDong;
    private int idDichVuDiKem;
    private int soLuong;

    public ContractDetail() {
    }

    public ContractDetail(int idHopDongChiTiet, int idHopDong, int idDichVuDiKem, int soLuong) {
        this.idHopDongChiTiet = idHopDongChiTiet;
        this.idHopDong = idHopDong;
        this.idDichVuDiKem = idDichVuDiKem;
        this.soLuong = soLuong;
    }

    public int getIdHopDongChiTiet() {
        return idHopDongChiTiet;
    }

    public void setIdHopDongChiTiet(int idHopDongChiTiet) {
        this.idHopDongChiTiet = idHopDongChiTiet;
    }

    public int getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(int idHopDong) {
        this.idHopDong = idHopDong;
    }

    public int getIdDichVuDiKem() {
        return idDichVuDiKem;
    }

    public void setIdDichVuDiKem(int idDichVuDiKem) {
        this.idDichVuDiKem = idDichVuDiKem;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
