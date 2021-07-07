package com.codegym.model.service.user_service;


import com.codegym.model.entity.use.User;

public interface UserService {
    Iterable<User> findAll();
}
