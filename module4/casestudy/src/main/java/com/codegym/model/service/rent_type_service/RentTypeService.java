package com.codegym.model.service.rent_type_service;


import com.codegym.model.entity.rent_type.RentType;


public interface RentTypeService {
    Iterable<RentType> findAll();
}
