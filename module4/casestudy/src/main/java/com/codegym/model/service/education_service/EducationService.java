package com.codegym.model.service.education_service;

import com.codegym.model.entity.division.Division;
import com.codegym.model.entity.education.Education;

public interface EducationService {
    Iterable<Education> findAll();

}
