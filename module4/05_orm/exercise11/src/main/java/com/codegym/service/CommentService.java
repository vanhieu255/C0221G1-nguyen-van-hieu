package com.codegym.service;

import com.codegym.entity.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> findAll();
    public Comment findOne(int id);
    public void save(Comment comment);
    public void update(Comment comment);



}
