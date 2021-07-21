package com.codegym.model.service.service_type_service;

import com.codegym.model.entity.customer_type.CustomerType;
import com.codegym.model.entity.service_type.ServiceType;
import org.springframework.stereotype.Service;

public interface ServiceTypeService {
    Iterable<ServiceType> findAll();

}
