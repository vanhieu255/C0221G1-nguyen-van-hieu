package model.service;

import model.bean.Customer;
import model.bean.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    void save(Employee employee) throws SQLException;

    List<Employee> selectEmployeeByName(String name);

    public boolean updateEmployee(Employee employee) throws SQLException;
    public Employee selectEmployee(int id);

    public boolean deleteEmployee(int id) throws SQLException;
}
