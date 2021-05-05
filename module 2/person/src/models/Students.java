package models;

public class Students extends Person {
    private String idClass;

    public Students() {
    }

    public Students(String idClass) {
        this.idClass = idClass;
    }

    public Students(String name, String date, String gender, String numberPhone, String idClass) {
        super(name, date, gender, numberPhone);
        this.idClass = idClass;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    @Override
    public String toString() {
        return super.toString() +"," + idClass ;
    }

}
