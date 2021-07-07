package com.codegym.model.service.employee_service;

import com.codegym.model.entity.customer.Customer;
import com.codegym.model.entity.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmployeeService {

    Page<Employee> findAll(Pageable pageable);
    Optional<Employee> findById(Integer id);
    void save(Employee employee);
    void remove(Integer id);
    Page<Employee> findAllByEmployeeNameContaining(String name, Pageable pageable);
}
