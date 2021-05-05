package models;

public  abstract class Person {
        //Tên, ngày sinh, giới tính , số điện thoại, mã lớp
    protected String name;
    protected String date;
    protected String gender;
    protected String numberPhone;

    public Person() {
    }

    public Person(String name, String date, String gender, String numberPhone) {
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return  name  +
                "," + date +
                "," + gender  +
                "," + numberPhone;
    }
}
