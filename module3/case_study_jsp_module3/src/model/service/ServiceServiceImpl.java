package model.service;

import model.bean.Service;
import model.repository.ServiceRepository;

import java.util.List;

public class ServiceServiceImpl implements ServiceService {
    ServiceRepository serviceRepository=new ServiceRepository();
    @Override
    public List<Service> findAll() {
        return serviceRepository.findAll();
    }
}
