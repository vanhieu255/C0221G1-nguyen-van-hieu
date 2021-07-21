package com.codegym.model.repository.contract_repository;

import com.codegym.model.entity.contract.Contract;
import com.codegym.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends PagingAndSortingRepository<Contract,Integer> {
//    @Query(value="select * from contract where id like %?1%",nativeQuery=true)
//    Page<Contract> findAllByIdContract(String id, Pageable pageable);
    @Query(value="select * from contract c join customer cu on c.customer_id=cu.id where cu.customer_name like :keyword and c.contract_end_date>=now()",nativeQuery=true)
    Page<Contract> findByNameContaining(@Param("keyword") String name, Pageable pageable);
//    Page<Contract> findAllByIdContaining(int id, Pageable pageable);

}
