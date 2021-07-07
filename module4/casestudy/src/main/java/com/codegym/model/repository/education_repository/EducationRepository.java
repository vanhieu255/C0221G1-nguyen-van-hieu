package com.codegym.model.repository.education_repository;

import com.codegym.model.entity.education.Education;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends PagingAndSortingRepository<Education,Integer> {

}
