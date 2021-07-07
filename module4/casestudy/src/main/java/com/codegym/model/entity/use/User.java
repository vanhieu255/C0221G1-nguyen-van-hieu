package com.codegym.model.entity.use;

import com.codegym.model.entity.employee.Employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @Column(name="user_name")
    private String userName;
    private String password;
    @OneToMany(mappedBy ="user")
    private List<Employee> employees;

    public User() {
    }

    public User(String userName, String password, List<Employee> employees) {
        this.userName = userName;
        this.password = password;
        this.employees = employees;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
