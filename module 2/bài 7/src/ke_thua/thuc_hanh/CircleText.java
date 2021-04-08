package ke_thua.thuc_hanh;

public class CircleText {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        Circle circle1=new Circle(3,"yellow",false);
        System.out.println(circle1);
        Circle circle2=new Circle(3.5);
        System.out.println(circle2);
    }
}
