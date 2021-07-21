package com.codegym.model.repository.employee_repository;

import com.codegym.model.entity.customer.Customer;
import com.codegym.model.entity.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {
    Page<Employee> findAllByEmployeeNameContaining(String name, Pageable pageable);

//    @Query(value = "select * from employee where flag = 1 and employee_name like:keyword",nativeQuery = true)
//        Page<Employee> findAllByEmployeeNameContaining(@Param("keyword") String name, Pageable pageable);
}
