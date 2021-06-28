package com.codegym.model.repository;

import com.codegym.model.entity.Book;
import com.codegym.model.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Integer> {
    public Optional<Customer> findByCode(String code);
}
