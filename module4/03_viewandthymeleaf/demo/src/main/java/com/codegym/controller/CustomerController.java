package com.codegym.controller;

import com.codegym.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {
    @GetMapping(value ="/loop")
    public String loop(Model model){
        List<Customer>listCustomer =new ArrayList<>();
        listCustomer.add(new Customer(1,"Jimmy","vietnam"));
        listCustomer.add(new Customer(2,"Hayden","american"));
        model.addAttribute("listCustomer",listCustomer);
        return "example_loop";

    }

}
