package model.service;

import model.bean.Contract;
import model.bean.Customer;
import model.bean.Employee;
import model.bean.Service;
import model.repository.ContractRepository;
import model.repository.CustomerRepository;

import java.sql.SQLException;
import java.util.List;

public class ContractServiceImpl implements ContractService {
    ContractRepository contractRepository= new ContractRepository();
    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public List<Customer> findAllCustomer() {
        return contractRepository.findAllCustomer();
    }

    @Override
    public List<Employee> findAllEmployee() {
        return contractRepository.findAllEmployee();
    }

    @Override
    public List<Service> findAllService() {
        return contractRepository.findAllService();
    }

    @Override
    public void save(Contract contract) throws SQLException {
        contractRepository.save(contract);

    }
}
