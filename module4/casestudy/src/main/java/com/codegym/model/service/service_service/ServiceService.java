package com.codegym.model.service.service_service;

import com.codegym.model.entity.service.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ServiceService {
    Page<Service> findAll(Pageable pageable);
    Iterable<Service> findAll();
    Optional<Service> findById(Integer id);
    void save(Service service);
    void remove(Integer id);
    Page<Service> findAllByServiceNameContaining(String search, Pageable pageable);

}
