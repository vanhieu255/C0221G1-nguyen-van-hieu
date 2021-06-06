package model.service;

import model.bean.*;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    void save(Employee employee) throws SQLException;

    List<Employee> selectEmployeeByName(String name);

    public boolean updateEmployee(Employee employee) throws SQLException;
    public Employee selectEmployee(int id);

    public boolean deleteEmployee(int id) throws SQLException;
    public  List<EmployeePosition> findAllEmployeePosition();
    public  List<EmployeeEducation> findAllEmployeeEducation();
    public  List<EmployeeDivision> findAllEmployeeDivision();
}
