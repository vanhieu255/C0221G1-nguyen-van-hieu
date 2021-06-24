package com.codegym.demo.controller;

import com.codegym.demo.model.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @GetMapping(value = "/")
    public String listCustomer(Model model){
        Customer customer=new Customer();
        model.addAttribute("customer",customer);
        return "register";
    }
@PostMapping(value = "/register")
    public String save(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "register";
        }else {
            return "success";
        }

}

}
