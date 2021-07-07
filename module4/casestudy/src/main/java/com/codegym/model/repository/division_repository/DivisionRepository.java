package com.codegym.model.repository.division_repository;

import com.codegym.model.entity.division.Division;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends PagingAndSortingRepository<Division,Integer> {
}
