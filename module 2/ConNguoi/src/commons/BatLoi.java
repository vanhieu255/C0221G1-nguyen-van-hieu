package commons;

public class BatLoi extends Exception {
    public BatLoi(String message) {
        super(message);
    }

//Tên, ngày sinh, giới tính , số điện thoại, mã lớp,lop,chieu cao
    public static void kiemTraTen(String ten) throws BatLoi {
        String regex="^[A-Z][a-z]{0,50}$";
        if(!ten.matches(regex)){
            throw new BatLoi("sai dịnh dang tên : Xxxx");
        }
    }

    public static void kiemTraNgaySinh(String ngaySinh) throws BatLoi {
        String regex="^[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4}$";
        if(!ngaySinh.matches(regex)){
            throw new BatLoi("sai dinh dang ngày sinh :xx/xx/xxxx");
        }
    }
    public static void kiemTraGioiTinh(String gioiTinh) throws BatLoi {
        String regex="^[A-Z][a-z]*$";
        if(!gioiTinh.matches(regex)){
            throw new BatLoi("nhap sai dinh dang gioi tinh :Xxxx");
        }
    }
    public static void kiemTraSoDientThoai(String soDienThoai) throws BatLoi {
        String regex="^[090|091|088]+[0-9]{6}$";
        if(!soDienThoai.matches(regex)){
            throw new BatLoi("nhap sai dinh dang so dien thoai : 090xxxxxx,091xxxxxxx,088xxxxxx");

        }
    }
    public static void kiemTraMaLop(String maLop) throws BatLoi {
        String regex="^[0-9]{1,2}$";
        if(!maLop.matches(regex)){
            throw new BatLoi("Nhap sai dinh dang mã lớp :XX");
        }
    }
    public static void kiemTraLop(String lop) throws BatLoi {
        String regex="^[0-9]{1,2}$";
        if(!lop.matches(regex)){
            throw new BatLoi("nhap sai dinh dang lớp :X OR XX");
        }
    }
    public static void kiemTraChieuCao(String chieuCao) throws BatLoi {
        String regex="^[0-9].[0-9]{1,2}$";
        if(!chieuCao.matches(regex)){
            throw new BatLoi("Nhap sai dinh dang chieu cao :X.X OR X.XX");
        }
    }



}
