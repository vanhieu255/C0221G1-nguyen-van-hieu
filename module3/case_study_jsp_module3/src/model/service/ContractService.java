package model.service;

import model.bean.*;

import java.sql.SQLException;
import java.util.List;

public interface ContractService {
    List<Contract> findAll();
    public List<Customer> findAllCustomer();
    public List<Employee> findAllEmployee();
    public List<Service> findAllService();

    void save(Contract contract) throws SQLException;
}
