package com.codegym.practice1.service;

import com.codegym.practice1.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
