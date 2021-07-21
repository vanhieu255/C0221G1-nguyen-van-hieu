package com.codegym.model.repository.service_repository;

import com.codegym.model.entity.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends PagingAndSortingRepository<Service,Integer>{
    Page<Service> findAllByServiceNameContaining(String search, Pageable pageable);
}
