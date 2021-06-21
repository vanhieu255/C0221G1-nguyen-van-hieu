package com.codegym.repository;

import com.codegym.entity.Comment;

import java.util.List;

public interface ICommentRepository {
    public List<Comment> findAll();
    public Comment findOne(int id);
    public void save(Comment comment);
    public void update(Comment comment);
}
