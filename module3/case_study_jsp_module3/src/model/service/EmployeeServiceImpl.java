package model.service;

import model.bean.*;
import model.repository.EmployeeRepository;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository =new EmployeeRepository();
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) throws SQLException {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> selectEmployeeByName(String name) {
        return employeeRepository.selectEmployeeByName(name);
    }

    @Override
    public boolean updateEmployee(Employee employee) throws SQLException {
        return employeeRepository.updateEmployee(employee);
    }

    @Override
    public Employee selectEmployee(int id) {
        return employeeRepository.selectEmployee(id);
    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException {
        return employeeRepository.deleteCustomer(id);
    }

    @Override
    public List<EmployeePosition> findAllEmployeePosition() {
        return employeeRepository.findAllEmployeePosition();
    }

    @Override
    public List<EmployeeEducation> findAllEmployeeEducation() {
        return employeeRepository.findAllEmployeeEducation();
    }

    @Override
    public List<EmployeeDivision> findAllEmployeeDivision() {
        return employeeRepository.findAllEmployeeDivision();
    }
}
