package com.codegym.model.repository;


import com.codegym.model.entity.Blog;
import com.codegym.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog,Integer> {
    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);
    @Query(value="select * from blog where catelogy_id=:id",nativeQuery=true)
    List<Blog> findAllBlogByCategory(Integer id);

}
