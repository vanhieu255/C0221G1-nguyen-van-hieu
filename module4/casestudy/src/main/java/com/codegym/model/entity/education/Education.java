package com.codegym.model.entity.education;

import com.codegym.model.entity.employee.Employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String educationName;
    @OneToMany(mappedBy ="education" )
    private List<Employee> employees;

    public Education() {
    }

    public Education(Integer id, String educationName, List<Employee> employees) {
        this.id = id;
        this.educationName = educationName;
        this.employees = employees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
