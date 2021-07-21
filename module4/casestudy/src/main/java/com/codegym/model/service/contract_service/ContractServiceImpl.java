package com.codegym.model.service.contract_service;

import com.codegym.model.entity.contract.Contract;
import com.codegym.model.entity.contract_detail.ContractDetail;
import com.codegym.model.repository.contract_detail_repository.ContractDetailRepository;
import com.codegym.model.repository.contract_repository.ContractRepository;
import com.codegym.model.service.contract_detail_service.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContractServiceImpl implements ContractService{
    @Autowired
    private ContractRepository contractRepository;


    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public Iterable<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public Optional<Contract> findById(Integer id) {
        return contractRepository.findById(id);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void remove(Integer id) {
        contractRepository.deleteById(id);

    }

    @Override
    public Page<Contract> findByNameContaining(String name, Pageable pageable) {
        return contractRepository.findByNameContaining("%"+name+"%",pageable);
    }

//    @Override
//    public Page<Contract> findAllByIdContaining(int id, Pageable pageable) {
//        return contractRepository.findAllByIdContaining(id,pageable);
//    }
}
