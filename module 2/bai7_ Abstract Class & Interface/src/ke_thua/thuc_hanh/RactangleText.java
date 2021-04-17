package ke_thua.thuc_hanh;

public class RactangleText {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1=new Rectangle(10,5);
        System.out.println(rectangle1);
        Rectangle rectangle2=new Rectangle(10,5,"blue",false);
        System.out.println(rectangle2);
    }
}
