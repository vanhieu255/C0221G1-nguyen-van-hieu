package com.codegym.model.service;

import com.codegym.model.entity.Question;
import com.codegym.model.entity.QuestionType;

public interface QuestionTypeService {
    Iterable<QuestionType> findAll();
}
