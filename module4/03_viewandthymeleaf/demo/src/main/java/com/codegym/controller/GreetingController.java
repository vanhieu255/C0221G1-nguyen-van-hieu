package com.codegym.controller;

import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GreetingController {
    @GetMapping("/")
    public String greeting(){
        return "greeting";
    }
    @GetMapping(value ="/comparision")
    public String operatorExample(){
        return "operator";
    }
    @GetMapping(value="/base")
    public String base(){
        return "base";
    }
    @GetMapping("/user")
    public String showUserList(Model model){
        List<User> userList =new ArrayList<>();
        userList.add(new User(0,"james","american",0));
        userList.add(new User(1,"ken","american",1));
        userList.add(new User(2,"bob","germany",2));
        userList.add(new User(3,"andy","vietnam",0));
        model.addAttribute("userList",userList);
        return "variable";
    }

    @GetMapping("/branch")
    public String branch(Model model){
        User user1 =new User(10,"Jimmy","localhost",1);
        User user2 =new User(11,"Hayden","server side",2);
        User user3 =new User(12,"Envy","127.0.0.1",0);
        ArrayList<User> listUser=new ArrayList<>();
        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user3);
        model.addAttribute("listUser",listUser);
        return "branch";


    }
}
