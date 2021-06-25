package com.codegym.controller;

import com.codegym.dto.UserDto;
import com.codegym.model.entity.User;
import com.codegym.model.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping(value = "/")
    public String showUser(Model model){
        Iterable<User> user=userService.findAll();
        model.addAttribute("user",user);
        return "list";

    }
    @GetMapping(value = "/user-create")
    public String index(Model model){
        UserDto userDto=new UserDto();
        model.addAttribute("userDto",userDto);
        return "index";
    }
    @PostMapping(value = "/user-create")
    public String result(@Valid @ModelAttribute("userDto") UserDto userDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "index";
        }else {
            User user =new User();
            BeanUtils.copyProperties(userDto,user);
            userService.save(user);
            return "redirect:/";
        }

    }
}
