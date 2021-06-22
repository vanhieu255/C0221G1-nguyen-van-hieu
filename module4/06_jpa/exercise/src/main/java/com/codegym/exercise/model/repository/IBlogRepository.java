package com.codegym.exercise.model.repository;

import com.codegym.exercise.model.entity.Blog;

import java.util.List;

public interface IBlogRepository {
    List<Blog> findAll();
    Blog findById(int id);
    void save(Blog blog);
    void remove(int id);
    void update(Blog blog);


}
