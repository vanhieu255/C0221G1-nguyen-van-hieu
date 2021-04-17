package ke_thua.thuc_hanh;

import bai_tap_1.Resizeable;

public class Shape implements Resizeable {
    private String collor="green";
    private boolean filled =true;

    public Shape(){
    }

    public Shape(String collor, boolean filled) {
        this.collor = collor;
        this.filled = filled;
    }

    public String getCollor() {
        return collor;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return " A Shape with collor of "
                + getCollor() +
                " and " +( isFilled()? "filler":"not filler");
    }

    @Override
    public void resize(double percent) {

    }
}
