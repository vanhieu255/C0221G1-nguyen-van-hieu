package com.codegym.service;

import com.codegym.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findOne(int id);
    User save(User user);


}
