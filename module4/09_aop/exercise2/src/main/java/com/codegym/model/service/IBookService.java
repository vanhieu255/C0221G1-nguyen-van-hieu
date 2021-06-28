package com.codegym.model.service;

import com.codegym.model.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IBookService {
    Page<Book> findAll(Pageable pageable);

    Optional<Book> findById(Integer id);

    void save(Book book);

}
