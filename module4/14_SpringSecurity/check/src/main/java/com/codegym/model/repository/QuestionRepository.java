package com.codegym.model.repository;

import com.codegym.model.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends PagingAndSortingRepository<Question, Integer> {
    @Query(value="select * from question where title like %?1% and question_type_id like %?2% order by status",nativeQuery = true)
    Page<Question> findAllQuestionByTwoColumn(String name, String name1, Pageable pageable);
    @Query(value="select * from question order by status asc,date_create asc",nativeQuery =true)
    Page<Question> fin1(Pageable pageable);
}
