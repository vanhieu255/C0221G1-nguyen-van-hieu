package com.codegym.model.service;

import com.codegym.model.entity.QuestionType;
import com.codegym.model.repository.QuestionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {
    @Autowired
    private QuestionTypeRepository questionTypeRepository;
    @Override
    public Iterable<QuestionType> findAll() {
        return questionTypeRepository.findAll();
    }
}
