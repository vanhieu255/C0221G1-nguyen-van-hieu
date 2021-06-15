package com.codegym.controller;

import com.codegym.service.ISumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumController {
    @Autowired
    private ISumService sumService;


    @GetMapping(value={"/","/goHello"})
    public String goHello(){
        return "hello_spring";
    }
     @PostMapping(value="/sum2Num")
    public String sum2Num(@RequestParam String number1, @RequestParam String number2, Model model){
        int a=Integer.parseInt(number1);
        int b=Integer.parseInt(number2);
        model.addAttribute("totalFinal",sumService.sum(a,b));
        return "result";



    }

}
