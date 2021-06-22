package com.codegym.practice1.repository;

import com.codegym.practice1.model.Customer;

public interface ICustomerRepository {

    boolean insertWithStoredProcedure(Customer customer);
}
