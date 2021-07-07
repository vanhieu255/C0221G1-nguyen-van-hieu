package com.codegym.model.service.education_service;

import com.codegym.model.entity.education.Education;
import com.codegym.model.repository.education_repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationServiceImpl implements EducationService {
    @Autowired
    private EducationRepository educationRepository;
    @Override
    public Iterable<Education> findAll() {
        return educationRepository.findAll();
    }
}
