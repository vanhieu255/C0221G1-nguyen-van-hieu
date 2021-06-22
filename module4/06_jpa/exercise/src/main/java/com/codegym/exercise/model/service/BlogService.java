package com.codegym.exercise.model.service;

import com.codegym.exercise.model.entity.Blog;
import com.codegym.exercise.model.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogService implements IBlogService{
@Autowired
private IBlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);

    }

    @Override
    public void remove(int id) {
        blogRepository.remove(id);

    }

    @Override
    public void update(Blog blog) {
        blogRepository.update(blog);

    }
}
