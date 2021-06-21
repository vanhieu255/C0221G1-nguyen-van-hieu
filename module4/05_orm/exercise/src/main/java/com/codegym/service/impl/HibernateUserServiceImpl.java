package com.codegym.service.impl;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class HibernateUserServiceImpl  implements UserService {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;
    static {
        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            sessionFactory.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> findAll() {
        String queryStr="SELECT c FROM User AS c";
        TypedQuery<User> query = entityManager.createQuery(queryStr, User.class);
        return query.getResultList();
    }

    @Override
    public User findOne(int id) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }
}
