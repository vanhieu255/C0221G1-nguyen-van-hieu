package models;

public class Teacher extends Person{
    private String lop;
    private double chieuCao;

    public Teacher() {
    }

    public Teacher(String lop, double chieuCao) {
        this.lop = lop;
        this.chieuCao = chieuCao;
    }

    public Teacher(String name, String date, String gender, String numberPhone, String lop, double chieuCao) {
        super(name, date, gender, numberPhone);
        this.lop = lop;
        this.chieuCao = chieuCao;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public String toString() {
        return  super.toString()+";"+lop + "," + chieuCao;
    }
}
