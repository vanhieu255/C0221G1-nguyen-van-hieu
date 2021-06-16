package com.codegym.controller;

import com.codegym.service.Impl.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private CheckService checkService;
    @GetMapping(value = "/")
    public String dictionary(){
        return "list";

    }
    @PostMapping(value="/dictionary")
    public String check(@RequestParam String search, Model model){
        model.addAttribute("result",checkService.checkDictionary(search));
        return "result";
    }
}
