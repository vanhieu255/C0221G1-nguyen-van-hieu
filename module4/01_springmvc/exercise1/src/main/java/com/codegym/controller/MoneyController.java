package com.codegym.controller;

import com.codegym.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MoneyController {
@Autowired
private IService iService;

@GetMapping(value="")
public String goHello(){
    return "list";
}
@PostMapping(value = "/multiplication")
public String multi2Number(@RequestParam String usd, @RequestParam String rate, Model model){
int a=Integer.parseInt(usd);
int b=Integer.parseInt(rate);
model.addAttribute("final1",iService.multiplication(a,b));
return "result";
    }
}
