package com.codegym.controller;

import com.codegym.model.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @GetMapping(value="/phone")
    public String showForm(Model model){
        Customer customer=new Customer();
        model.addAttribute("customer",customer);
        return "form";
    }
    @PostMapping(value ="/create-phone")
    public String savePhone(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult){
        new Customer().validate(customer,bindingResult);
        if(bindingResult.hasErrors()){
            return "form";
        }else {
            return "result";
        }
    }
}
