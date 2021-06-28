package com.codegym.model.repository;

import com.codegym.model.entity.Book;
import com.codegym.model.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IBookRepository extends PagingAndSortingRepository<Book,Integer> {

}
