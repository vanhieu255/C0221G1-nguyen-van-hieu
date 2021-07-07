package com.codegym.model.repository.user_repository;

import com.codegym.model.entity.use.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User,String> {

}
