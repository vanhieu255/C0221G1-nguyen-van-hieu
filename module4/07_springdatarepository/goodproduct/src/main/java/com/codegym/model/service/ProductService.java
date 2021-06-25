package com.codegym.model.service;

import com.codegym.model.entity.Product;
import com.codegym.model.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ProductService implements IProductService {
@Autowired
private IProductRepository productRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);

    }

    @Override
    public void remove(Integer id) {
        productRepository.deleteById(id);

    }
    @Override
    public Page<Product> findAllByNameProductContaining(String nameProduct, Pageable pageable) {
        return productRepository.findAllByNameProductContaining(nameProduct,pageable);
    }
}
