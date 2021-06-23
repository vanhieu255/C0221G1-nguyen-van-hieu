package com.codegym.exercise.model.repository;

import com.codegym.exercise.model.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class BlogRepository implements IBlogRepository {

    @PersistenceContext
    private EntityManager em;
    @Override
    public List<Blog> findAll() {
       TypedQuery<Blog> query = em.createQuery("select b from Blog b", Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog findById(int id) {
        TypedQuery<Blog> query = em.createQuery("select b from Blog b where  b.id=:id", Blog.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void save(Blog blog) {


            if (blog.getId() != null) {

                em.merge(blog);
            } else {
                em.persist(blog);
            }

    }


    @Override
    public void remove(int id) {
        Blog blog = findById(id);
        if (blog != null) {
            em.remove(blog);
        }

    }

    @Override
    public void update(Blog blog) {
        em.merge(blog);
    }
}
