package com.codegym.model.service;

import com.codegym.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface IBlogService  {
    Page<Blog> findAll(Pageable pageable);

    Optional<Blog> findById(Integer id);

    void save(Blog blog);

    void remove(Integer id);
    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);

    List<Blog> findAllBlogByCategory(@Param("id") Integer id);
}
