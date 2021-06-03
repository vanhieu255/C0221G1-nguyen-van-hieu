package model.service;

import model.bean.Customer;
import model.repository.CustomerRepository;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository= new CustomerRepository();


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) throws SQLException {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> selectCustomerByName(String name) {
        return customerRepository.selectCustomerByName(name);
    }

    @Override
    public boolean updateCutomer(Customer customer) throws SQLException {
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public Customer selectCustomer(int id) {
        return customerRepository.selectCustomer(id);
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        return customerRepository.deleteCustomer(id);
    }


//
//    @Override
//    public Customer findById(int id) {
////        return customerRepository.findById(id);
//
////    }
//
//    @Override
//    public void update(int id, Customer customer) {
//        customerRepository.update(id,customer);
//    }
//
//    @Override
//    public void remove(int id) {
//        customerRepository.remove(id);
//    }

}
