package com.codegym.repository;

import com.codegym.entity.Comment;
import com.codegym.service.CommentServiceImpl;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public class CommentRepository implements ICommentRepository  {


    @Override
    public List<Comment> findAll() {
        return BaseRepository.entityManager.createQuery("select c from Comment c ",Comment.class).getResultList();
    }

    @Override
    public Comment findOne(int id) {
        return BaseRepository.entityManager.find(Comment.class,id);
    }


    @Override
    public void save(Comment comment) {
        EntityTransaction entityTransaction=BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(comment);
        entityTransaction.commit();
    }

    @Override
    public void update(Comment comment) {
        EntityTransaction entityTransaction=BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(comment);
        entityTransaction.commit();
    }
}
