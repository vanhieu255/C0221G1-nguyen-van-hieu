package com.codegym.model.service;

import com.codegym.model.entity.Customer;
import com.codegym.model.entity.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);

    Optional<Customer> findById(Long id);

    Customer save(Customer customer) throws DuplicateEmailException;

    void remove(Long id);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
