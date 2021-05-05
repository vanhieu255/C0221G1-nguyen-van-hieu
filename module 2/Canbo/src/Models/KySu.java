package Models;

public class KySu extends CanBo {
    private String nganhDaotao;

    public KySu() {
    }


    public KySu(String ten, String namSinh, String gioiTinh, String diaChi, String nganhDaotao) {
        super(ten, namSinh, gioiTinh, diaChi);
        this.nganhDaotao = nganhDaotao;
    }

    public String getNganhDaotao() {
        return nganhDaotao;
    }

    public void setNganhDaotao(String nganhDaotao) {
        this.nganhDaotao = nganhDaotao;
    }

    @Override
    public String hienThi() {
        return super.toString()+","+nganhDaotao;
    }
}
