package commons;

public class BatLoi extends Exception{
    public BatLoi(String message) {
        super(message);
    }
    public static void kiemTraBac(String bac) throws BatLoi {
        String regex="^[0-9]\\/[7]$";
        if(!bac.matches(regex)){
            throw new BatLoi("NHAP SAI DINH DANG BAC :X/7");
        }
    }
    public static void kiemTraCongViec(String congViec) throws BatLoi {
        String regex="^(Ngoai troi|Trong Nha)$";
        if(!congViec.matches(regex)){
            throw new BatLoi("nhap sai dinh dang : Ngoai troi|Trong Nha");
        }

    }


}
