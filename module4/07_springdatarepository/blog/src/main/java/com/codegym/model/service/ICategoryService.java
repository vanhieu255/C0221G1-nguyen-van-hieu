package com.codegym.model.service;

import com.codegym.model.entity.Blog;
import com.codegym.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICategoryService {
    Iterable<Category> findAll();
    Optional<Category> findById(Integer id);

    void save(Category category);
    void remove(Integer id);


}
