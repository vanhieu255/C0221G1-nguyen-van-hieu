package com.codegym.model.service;

import com.codegym.model.entity.User;

import java.util.Optional;

public interface IUserService  {
Iterable<User> findAll();
Optional<User> findById(Integer id);
    void save(User user);

}
