package com.codegym.model.repository.rent_type_repository;

import com.codegym.model.entity.rent_type.RentType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentTypeRepository extends PagingAndSortingRepository<RentType,Integer>{
}
