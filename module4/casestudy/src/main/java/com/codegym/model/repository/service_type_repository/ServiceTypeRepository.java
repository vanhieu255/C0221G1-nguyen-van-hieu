package com.codegym.model.repository.service_type_repository;

import com.codegym.model.entity.service.Service;
import com.codegym.model.entity.service_type.ServiceType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceTypeRepository extends PagingAndSortingRepository<ServiceType,Integer> {
}
