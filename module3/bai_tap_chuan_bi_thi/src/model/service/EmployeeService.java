package model.service;

import model.bean.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    void save(Employee employee) throws SQLException;
    public boolean deleteEmployee(int id) throws SQLException;
    public boolean updateEmployee(Employee employee) throws SQLException;
    public Employee selectEmployee(int id);

}
