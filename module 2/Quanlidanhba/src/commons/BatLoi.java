package commons;

public class BatLoi extends Exception {
    public BatLoi(String message) {
        super(message);
    }
    // //Số điện thoại. - Nhóm của danh bạ. - Họ tên. - Giới tính. - Địa chỉ - Ngày sinh. - Email.
    public static void kiemTraSoDientThoai(String soDienThoai) throws BatLoi {
        String regex="^[0-9]{10}$";
        if(!soDienThoai.matches(regex)){
            throw new BatLoi("nhap sai dinh dang so dien thoai : XXXXXXXXXX");
        }
    }

    public static void kiemTraEmail(String email) throws BatLoi {
        String regex="^[A-Z,a-z,1-9]+\\@[A-Z,a-z]+\\.[A-Z,a-z,1-9]+$";
        if(!email.matches(regex)){
            throw new BatLoi("nhap sai dinh dang so dien thoai : x.@xx.xx");
        }
    }
}
