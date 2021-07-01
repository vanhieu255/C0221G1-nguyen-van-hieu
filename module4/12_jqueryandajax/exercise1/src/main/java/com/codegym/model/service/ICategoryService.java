package com.codegym.model.service;

import com.codegym.model.entity.Category;

import java.util.Optional;

public interface ICategoryService {
    Iterable<Category> findAll();
    Optional<Category> findById(Integer id);

    void save(Category category);
    void remove(Integer id);


}
