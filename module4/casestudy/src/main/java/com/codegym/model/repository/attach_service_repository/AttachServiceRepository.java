package com.codegym.model.repository.attach_service_repository;


import com.codegym.model.entity.attach_service.AttachService;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachServiceRepository extends PagingAndSortingRepository<AttachService,Integer> {

}
