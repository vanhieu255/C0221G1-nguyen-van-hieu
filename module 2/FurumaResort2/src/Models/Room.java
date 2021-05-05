package Models;

public class Room extends Services implements Comparable<Room> {
    private DichVuDiKem dichVuDiKem;

    public Room() {
    }

    public Room(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    public Room(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, DichVuDiKem dichVuDiKem) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.dichVuDiKem = dichVuDiKem;
    }

    public DichVuDiKem getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    @Override
    public String toString() {
        return super.toString() +","+ dichVuDiKem;
    }

    @Override
    public void showInfor() {
        System.out.println("Room{" +
                "dichVuDiKem=" + dichVuDiKem +
                '}'+super.toString());
    }

    @Override
    public int compareTo(Room o) {
        if (this.getTenDichVu().compareTo(o.getTenDichVu()) > 0){
            return 1;
        } else if (this.getTenDichVu().compareTo(o.getTenDichVu()) < 0){
            return -1;
        } else {
            return 0;
        }
    }
}
