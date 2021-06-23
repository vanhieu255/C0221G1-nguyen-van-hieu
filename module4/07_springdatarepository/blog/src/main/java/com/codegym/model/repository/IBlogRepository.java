package com.codegym.model.repository;


import com.codegym.model.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog,Integer>{
    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);

}
