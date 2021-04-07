package bai_tap_1;

public class Circle {
    private double radius;
    private String collor="";
    public Circle(){

    }
    public Circle(double radius,String collor){
        this.radius=radius;
        this.collor=collor;
    }

    public double getRadius() {
        return radius;
    }

    public String getCollor() {
        return collor;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", collor='" + collor + '\'' +
                '}';
    }
}
