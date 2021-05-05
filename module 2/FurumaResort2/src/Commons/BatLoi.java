package Commons;

public class BatLoi extends Exception{
    public BatLoi(String message) {
        super(message);
    }

    public static void kiemTraMaDichVu(String maDichVu) throws BatLoi {
        String regex="^(SV)[VL|HO|RO]-[0-9]+$";
        if(!maDichVu.matches(regex)){
            throw new BatLoi("nhap sai dinh dang : SVXX-YYYY");
        }
    }

    public static void kiemTraTenDichVu(String tenDichVu) throws BatLoi {
        String regex="[A-Z][a-z,0-9]*";
        if(!tenDichVu.matches(regex)){
            throw new BatLoi("nhap sai dinh dang : Xx");
        }

    }
    public static void kiemTraDienTichHoBoi(String dienTichHoBoi) throws BatLoi {
        String regex="^[3-9][0-9]+$";
        if(!dienTichHoBoi.matches(regex)){
            throw new BatLoi("nhap sai dinh dang : >30");
        }
    }

    public static void kiemTraChiPhiThue(String chiPhiThue) throws BatLoi {
        String regex="^[1-9]+$";
        if (!chiPhiThue.matches(regex)){
            throw new BatLoi("nhap sai dinh dang : >0");
        }
    }

    //Bat Loi Khach Hang

    public static void kiemTraTenKhachHan(String tenKhachHang) throws BatLoi {
        String regex="^[A-Z][a-z]+$";
        if(!tenKhachHang.matches(regex)){
            throw new BatLoi("Nhap sai ,Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ");
        }
    }
    public static void kiemTraEmail(String email) throws BatLoi {
        String regex="^[A-Z,a-z,1-9]+\\@[A-Z,a-z]+\\.[A-Z,a-z,1-9]+$";
        if(!email.matches(regex)){
            throw new BatLoi("nhap sai ,Email phải đúng định dạng abc@abc.abc");
        }

    }
    public static void kiemTraGioiTinh(String gioiTinh) throws BatLoi {
        String regex="^[Male|Female|Unknow]$";
        if(!gioiTinh.matches(regex)){
            throw new BatLoi("nhap sai roi , nhap lại");
        }

    }
    public static void kiemTraCmnd(String cmnd) throws BatLoi {
        String regex="^[0-9]{9}$";
        if(!cmnd.matches(regex)){
            throw new BatLoi("Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX");
        }
    }
    public static void kiemTraNgaySinh(String ngaySinh) throws BatLoi {
        String regex="^\\d{2}[-|/]\\d{2}[-|/]\\d{4}$";
        if(!ngaySinh.matches(regex)){
            throw new BatLoi("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy");
        }
    }


}
