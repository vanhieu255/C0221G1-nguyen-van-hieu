package com.codegym.controller;

import com.codegym.service.CaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @Autowired
    private CaculatorService caculatorService;

    @GetMapping(value = "/")
    public String show(){
        return "list";
    }
    @GetMapping(value ="/caculator")
    public String add(@RequestParam String number1, String number2,String cacul, Model model){
        double a=Double.parseDouble(number1);
        double b=Double.parseDouble(number2);
        double result =caculatorService.caculator(a,b,cacul);
        if(cacul.equals("Addition(+)")){
            model.addAttribute("message","Result Addition :");
        }else if(cacul.equals("Subtraction(-)")){
            model.addAttribute("message","Result Subtraction  :");
        }else if (cacul.equals("Multiplication(*)" )){
            model.addAttribute("message","Result Multiplication :");
        }else if(cacul.equals("Division(/)" )){
            model.addAttribute("message","Result Division :");
        }


        model.addAttribute("result",result);
        return "list";
    }

}
