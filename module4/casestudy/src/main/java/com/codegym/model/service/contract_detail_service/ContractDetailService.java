package com.codegym.model.service.contract_detail_service;

import com.codegym.model.entity.contract_detail.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

public interface ContractDetailService {
    Page<ContractDetail> findAll(Pageable pageable);
    Iterable<ContractDetail>findAll();
    Optional<ContractDetail> findById(Integer id);
    void save(ContractDetail contractDetail);
    void remove(Integer id);
}
