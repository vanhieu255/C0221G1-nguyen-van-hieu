package model.service;


import model.bean.*;

import java.sql.SQLException;
import java.util.List;

public interface ServiceService {
    List<Service> findAll();
    public  List<ServiceType> findAllServiceType();
    public  List<ServiceTypeRent> findAllServiceTypeRent();

    void save(Service service) throws SQLException;
//
//    List<Customer> selectCustomerByName(String name);
//
//    public boolean updateCutomer(Customer customer) throws SQLException;
//    public Customer selectCustomer(int id);
//
//    public boolean deleteCustomer(int id) throws SQLException;
}
