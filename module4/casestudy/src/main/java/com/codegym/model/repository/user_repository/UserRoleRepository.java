package com.codegym.model.repository.user_repository;


import com.codegym.model.entity.use.AppUser;
import com.codegym.model.entity.use.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
