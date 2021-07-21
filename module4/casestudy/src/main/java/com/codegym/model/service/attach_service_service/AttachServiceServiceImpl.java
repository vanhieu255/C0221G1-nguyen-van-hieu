package com.codegym.model.service.attach_service_service;

import com.codegym.model.entity.attach_service.AttachService;
import com.codegym.model.repository.attach_service_repository.AttachServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttachServiceServiceImpl implements AttachServiceService {
    @Autowired
    private AttachServiceRepository attachServiceRepositoryImpl;
    @Override
    public Iterable<AttachService> findAll() {
        return attachServiceRepositoryImpl.findAll();
    }
}
