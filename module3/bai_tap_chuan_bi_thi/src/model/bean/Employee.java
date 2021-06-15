package model.bean;

public class Employee {
    private int idEmployee;
    private String nameEmployee;
    private String date;

    public Employee() {
    }

    public Employee(String nameEmployee, String date) {
        this.nameEmployee = nameEmployee;
        this.date = date;
    }

    public Employee(int idEmployee, String nameEmployee, String date) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.date = date;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
