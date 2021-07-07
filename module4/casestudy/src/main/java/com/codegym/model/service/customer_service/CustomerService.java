package com.codegym.model.service.customer_service;

import com.codegym.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Optional<Customer> findById(Integer id);
    void save(Customer customer);
    void remove(Integer id);
    Page<Customer> findAllByCustomerNameContaining(String name,Pageable pageable);


}
