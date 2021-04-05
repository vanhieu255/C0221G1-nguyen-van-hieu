package bai_tap;

import java.util.Scanner;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn() == true) {
            return "Fan{" +
                    " speed=" + speed +
                    " radius=" + radius +
                    " color='" + color + '\'' +
                    "fan is on" +
                    '}';
        } else {
            return "Fan{" +
                    " speed=" + speed +
                    " radius=" + radius +
                    " color='" + color + '\'' +
                    " fan is off" +
                    '}';

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fan fan1=new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());

        Fan fan2=new Fan();
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.toString());
    }
}
