package com.codegym.model.service.service_service;

import com.codegym.model.repository.service_repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Page<com.codegym.model.entity.service.Service> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Iterable<com.codegym.model.entity.service.Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Optional<com.codegym.model.entity.service.Service> findById(Integer id) {
        return serviceRepository.findById(id);
    }

    @Override
    public void save(com.codegym.model.entity.service.Service service) {
        serviceRepository.save(service);

    }

    @Override
    public void remove(Integer id) {
        serviceRepository.deleteById(id);

    }


    @Override
    public Page<com.codegym.model.entity.service.Service> findAllByServiceNameContaining(String search, Pageable pageable) {
        return serviceRepository.findAllByServiceNameContaining(search,pageable);
    }
}
