package com.codegym.model.service;

import com.codegym.model.entity.Blog;
import com.codegym.model.entity.Category;
import com.codegym.model.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;


import java.util.Optional;

@Service
public class BlogService implements IBlogService{
@Autowired
private IBlogRepository iBlogRepository;
@Autowired
private ICategoryService categoryService;


    @ModelAttribute("category")
    public Iterable<Category> provinces(){
        return categoryService.findAll();
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogRepository.findAll(pageable);
    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);

    }

    @Override
    public void remove(Integer id) {
        iBlogRepository.deleteById(id);

    }

    @Override
    public Page<Blog> findAllByTitleContaining(String title, Pageable pageable) {
        return iBlogRepository.findAllByTitleContaining(title,pageable);
    }


}
