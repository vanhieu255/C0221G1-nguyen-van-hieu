package commons;

public class PersonException extends Exception {
    public PersonException(String message) {
        super(message);
    }

    //Tên, ngày sinh, giới tính , số điện thoại, mã lớp.
    public static void checkName(String name) throws PersonException {
        String regex="^[A-Z][a-z]{0,50}$";
        if(!name.matches(regex)){
            throw new PersonException("nhap sai dinh dang :Xxxx");
        }

    }
    public static void checkChieuCao(String chieucao) throws PersonException {
        String regex="^[0-9].[0-9]{1,2}$";
        if(!chieucao.matches(regex)){
            throw new PersonException("nhap sai dinh dang chieu cao x.xx");
        }

    }

    public static void checkDate(String date) throws PersonException {
        String regex="^[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}$";
        if(!date.matches(regex)){
            throw new PersonException("nhap sai dinh dang date :xx/xx/xxxx");
        }

    }
    public static void checkNumberPhone(String numberphone) throws PersonException {
        String regex="^[091|090|088]+[0-9]{6}$";
        if(!numberphone.matches(regex)){
            throw new PersonException("NHAP SAI DINH DANG SO : 091xxxxxx,090xxxxx,088xxxxxx");
        }
    }
    public static void checkClass(String lop) throws PersonException {
        String regex="^[0-9]$";
        if(!lop.matches(regex)){
            throw new PersonException("nhap sai dinh dang lop");
        }
    }

}
