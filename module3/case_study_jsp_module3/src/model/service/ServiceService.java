package model.service;


import model.bean.Service;

import java.sql.SQLException;
import java.util.List;

public interface ServiceService {
    List<Service> findAll();

//    void save(Customer customer) throws SQLException;
//
//    List<Customer> selectCustomerByName(String name);
//
//    public boolean updateCutomer(Customer customer) throws SQLException;
//    public Customer selectCustomer(int id);
//
//    public boolean deleteCustomer(int id) throws SQLException;
}
