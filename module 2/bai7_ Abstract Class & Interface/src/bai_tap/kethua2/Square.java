package bai_tap.kethua2;
import bai_tap_2.*;
public class Square extends Rectangle implements Colorable {
    private double width=1.0;
    private double length=1.0;

    public Square(){

    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double width) {
            setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }


    @Override
    public String howToColor() {
        return "Color all four sides..";
    }
}




