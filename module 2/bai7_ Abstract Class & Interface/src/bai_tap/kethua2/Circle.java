package bai_tap.kethua2;

public class Circle extends Shape  {

    private double radius;
    public Circle(){ }
    public Circle(double radius) {
        this.radius = radius;
    }
    public  Circle(double radius,String collor, boolean filled){
        super(collor,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
            this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double  getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius ="
                + getRadius()
                +", which is subclass of "
                +super.toString();
    }
}
