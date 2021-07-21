package com.codegym.dto;

import com.codegym.model.entity.QuestionType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class QuestionDto {

    private Integer id;
    @NotBlank(message = "Title not null")
    @Size(min = 5,max = 100,message = "title size from 5 to 100")
    private String title;
    @NotBlank(message = "content not null")
    @Size(min = 10,max = 500,message = " content size from 10 to 500")
    private String content;
    @NotBlank(message = "answer not null")
    private String answer;
    @NotBlank(message = "dateCreate not null")
    private String dateCreate;
    @NotBlank(message = "status not null")
    private String status;
    private QuestionType questionType;

    public QuestionDto() {
    }

    public QuestionDto(Integer id, @NotBlank(message = "Title not null") @Size(min = 5, max = 100, message = "title size from 5 to 100") String title, @NotBlank(message = "content not null") @Size(min = 10, max = 500, message = " content size from 10 to 500") String content, @NotBlank(message = "answer not null") String answer, @NotBlank(message = "dateCreate not null") String dateCreate, @NotBlank(message = "status not null") String status, QuestionType questionType) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.answer = answer;
        this.dateCreate = dateCreate;
        this.status = status;
        this.questionType = questionType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }
}
