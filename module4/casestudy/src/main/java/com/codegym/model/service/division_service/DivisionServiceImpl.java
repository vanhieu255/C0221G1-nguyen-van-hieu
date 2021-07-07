package com.codegym.model.service.division_service;

import com.codegym.model.entity.division.Division;
import com.codegym.model.repository.division_repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DivisionServiceImpl implements DivisionService{
@Autowired
private DivisionRepository divisionRepository;
    @Override
    public Iterable<Division> findAll() {
        return divisionRepository.findAll();
    }
}
