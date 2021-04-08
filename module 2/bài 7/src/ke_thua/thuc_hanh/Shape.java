package ke_thua.thuc_hanh;

public class Shape {
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
}
