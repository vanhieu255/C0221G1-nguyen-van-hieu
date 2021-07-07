package com.codegym.model.service.customer_type_service;

import com.codegym.model.entity.customer.Customer;
import com.codegym.model.entity.customer_type.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerTypeService {
    Iterable<CustomerType> findAll();
}
