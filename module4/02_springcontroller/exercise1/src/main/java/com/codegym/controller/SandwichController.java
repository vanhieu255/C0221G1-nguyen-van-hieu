package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RequestMapping(value = "/save")
@Controller
public class SandwichController {
    @GetMapping(value = {"/"})
    public String showSandwich(){
        return "list";
    }
    @PostMapping(value = "/sandwich")
    public String save(@RequestParam("condiment") String[] condiment, Model model){
        model.addAttribute("condiment",condiment);
        return "result";
    }
}
