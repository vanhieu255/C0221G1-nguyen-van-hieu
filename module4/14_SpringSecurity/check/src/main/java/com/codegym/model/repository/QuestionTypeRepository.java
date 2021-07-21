package com.codegym.model.repository;

import com.codegym.model.entity.QuestionType;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface QuestionTypeRepository extends PagingAndSortingRepository<QuestionType ,Integer> {
}
