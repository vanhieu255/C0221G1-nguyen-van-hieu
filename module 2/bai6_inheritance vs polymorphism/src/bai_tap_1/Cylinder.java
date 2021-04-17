package bai_tap_1;

public class Cylinder extends Circle{
    private double h;
    public Cylinder(){

    }
    public Cylinder(double radius,String collor,double h){
        super(radius,collor);
        this.h=h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double getAreaH(){
        return super.getArea()*h;

    }

    @Override
    public String toString() {
        return "Cylinder" +
                "h=" + h
                +", which is subclass of "
                +super.toString();
    }
}
