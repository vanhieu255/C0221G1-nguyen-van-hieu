package com.codegym.model.repository.customer_type_repository;

import com.codegym.model.entity.customer_type.CustomerType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerTypeRepository extends PagingAndSortingRepository<CustomerType,Integer> {
}
