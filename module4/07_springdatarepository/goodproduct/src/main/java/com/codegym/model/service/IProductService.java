package com.codegym.model.service;

import com.codegym.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public interface IProductService {
    Page<Product> findAll(Pageable pageable);
    Optional <Product> findById(Integer id);
    void save(Product product);
    void remove(Integer id);
    Page<Product> findAllByNameProductContaining(String nameProduct, Pageable pageable);




}
