package com.codegym.model.service;

import com.codegym.model.entity.Question;
import com.codegym.model.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class QuestionServiceImpl implements  QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public Page<Question> findAll(Pageable pageable) {
        return questionRepository.findAll(pageable);
    }

    @Override
    public Iterable<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Optional<Question> findById(Integer id) {
        return questionRepository.findById(id);
    }

    @Override
    public void save(Question question) {
        questionRepository.save(question);

    }

    @Override
    public void remove(Integer id) {
        questionRepository.deleteById(id);

    }

    @Override
    public Page<Question> fin1(Pageable pageable) {
        return questionRepository.fin1(pageable);
    }



    @Override
    public Page<Question> findAllQuestionByTwoColumn(String name, String name1, Pageable pageable) {
        return questionRepository.findAllQuestionByTwoColumn(name,name1,pageable);
    }
}
