package com.codegym.model.repository.customer_repository;

import com.codegym.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer,Integer> {
    Page<Customer> findAllByCustomerNameContaining(String name,Pageable pageable);

    @Query(value="select * from customer where customer_name like %?1% and customer_address like %?2% and customer_type_id like %?3%",nativeQuery = true)
    Page<Customer> findAllCustomerByThreeColumn(String name,String name1,String name2,Pageable pageable);
}
