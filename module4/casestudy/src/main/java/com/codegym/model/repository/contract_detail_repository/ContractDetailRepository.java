package com.codegym.model.repository.contract_detail_repository;

import com.codegym.model.entity.contract_detail.ContractDetail;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractDetailRepository extends PagingAndSortingRepository<ContractDetail,Integer> {
    Page<ContractDetail> findAll(Pageable pageable);
}
