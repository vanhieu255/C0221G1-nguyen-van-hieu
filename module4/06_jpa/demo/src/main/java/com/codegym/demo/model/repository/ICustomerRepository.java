package com.codegym.demo.model.repository;

import com.codegym.demo.model.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends IGeneralRepository<Customer> {
}
