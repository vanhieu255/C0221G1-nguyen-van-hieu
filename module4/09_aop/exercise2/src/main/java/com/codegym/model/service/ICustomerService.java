package com.codegym.model.service;

import com.codegym.model.entity.Book;
import com.codegym.model.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    Optional<Customer> findById(Integer id);

    void save(Customer customer);

    Optional<Customer> findByCode(String code);
    void remove(Integer id);
}
