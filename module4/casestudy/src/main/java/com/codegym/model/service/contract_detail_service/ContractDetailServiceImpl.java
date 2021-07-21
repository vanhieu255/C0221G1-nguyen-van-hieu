package com.codegym.model.service.contract_detail_service;

import com.codegym.model.entity.contract_detail.ContractDetail;
import com.codegym.model.repository.contract_detail_repository.ContractDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.Optional;
@Service
public class ContractDetailServiceImpl implements ContractDetailService{
@Autowired
private ContractDetailRepository contractDetailRepository;
    @Override
    public Page<ContractDetail> findAll(Pageable pageable) {
        return contractDetailRepository.findAll(pageable);
    }

    @Override
    public Iterable<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public Optional<ContractDetail> findById(Integer id) {
        return contractDetailRepository.findById(id);
    }

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);

    }

    @Override
    public void remove(Integer id) {
        contractDetailRepository.deleteById(id);

    }
}
