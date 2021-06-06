package model.service;

import model.bean.Customer;
import model.bean.Service;
import model.bean.ServiceType;
import model.bean.ServiceTypeRent;
import model.repository.ServiceRepository;

import java.sql.SQLException;
import java.util.List;

public class ServiceServiceImpl implements ServiceService {
    ServiceRepository serviceRepository=new ServiceRepository();
    @Override
    public List<Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public List<ServiceType> findAllServiceType() {
        return serviceRepository.findAllServiceType();
    }

    @Override
    public List<ServiceTypeRent> findAllServiceTypeRent() {
        return serviceRepository.findAllServiceTypeRent();
    }

    @Override
    public void save(Service service) throws SQLException {
        serviceRepository.save(service);

    }
}
