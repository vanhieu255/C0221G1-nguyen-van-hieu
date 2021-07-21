package com.codegym.model.service.contract_service;

import com.codegym.model.entity.contract.Contract;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

public interface ContractService {
    Page<Contract> findAll(Pageable pageable);
    Iterable<Contract> findAll();
    Optional<Contract> findById(Integer id);
    void save(Contract contract);
    void remove(Integer id);
    Page<Contract> findByNameContaining(String name, Pageable pageable);


//Page<Contract> findAllById(String id, Pageable pageable);
}
