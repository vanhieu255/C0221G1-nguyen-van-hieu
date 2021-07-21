package com.codegym.model.service;

import com.codegym.model.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface QuestionService {
    Page<Question> findAll(Pageable pageable);
    Iterable<Question> findAll();
    Optional<Question> findById(Integer id);
    void save(Question question);
    void remove(Integer id);
    Page<Question> fin1(Pageable pageable);
    Page<Question> findAllQuestionByTwoColumn(String name,String name1,Pageable pageable);
}
