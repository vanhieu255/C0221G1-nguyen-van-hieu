package com.codegym.model.service;

import com.codegym.model.entity.Customer;
import com.codegym.model.entity.Province;
import com.codegym.model.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServcie implements  ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;


    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }




    @Override
    public Customer save(Customer customer) throws DuplicateEmailException {

        try {
            return customerRepository.save(customer);
        } catch (DataIntegrityViolationException e) {
            throw new DuplicateEmailException();
        }
    }

    @Override
    public void remove(Long id) {
       customerRepository.deleteById(id);

    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable) {
        return  customerRepository.findAllByFirstNameContaining(firstname, pageable);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }
}
