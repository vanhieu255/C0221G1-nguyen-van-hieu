//package com.codegym.model.service.user_service;
//
//
//
//import com.codegym.model.entity.use.AppUser;
//import com.codegym.model.entity.use.UserRole;
//import com.codegym.model.repository.user_repository.AppUserRepository;
//import com.codegym.model.repository.user_repository.UserRoleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//
//    private AppUserRepository appUserRepository;
//
//    @Autowired
//    private UserRoleRepository userRoleRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        AppUser user = this.appUserRepository.findByUserName(userName);
//
//        if (user == null) {
//            System.out.println("User not found! " + userName);
//            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
//        }
//
//        System.out.println("Found User: " + user);
//
//        // [ROLE_USER, ROLE_ADMIN,..]
//        List<UserRole> userRoles = this.userRoleRepository.findByAppUser(user);
//
//        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
//        if (userRoles != null) {
//            for (UserRole userRole : userRoles) {
//                // ROLE_USER, ROLE_ADMIN,..
//                GrantedAuthority authority = new SimpleGrantedAuthority(userRole.getAppRole().getRoleName());
//                grantList.add(authority);
//            }
//        }
//
//        UserDetails userDetails = (UserDetails) new org.springframework.security.core.userdetails.User(user.getUserName(), //
//                user.getEncrytedPassword(), grantList);
//
//        return userDetails;
//    }
//
//}
