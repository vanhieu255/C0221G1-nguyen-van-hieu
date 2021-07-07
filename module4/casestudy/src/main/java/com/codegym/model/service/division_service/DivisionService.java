package com.codegym.model.service.division_service;

import com.codegym.model.entity.customer_type.CustomerType;
import com.codegym.model.entity.division.Division;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DivisionService {
    Iterable<Division> findAll();
}
