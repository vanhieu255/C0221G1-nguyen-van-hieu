package com.codegym.controller;

import com.codegym.model.SettingEmail;
import com.codegym.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SettingEmailController {
    @Autowired
    private SettingService settingService;

    @GetMapping(value = "/setting")
    public String goToForm(Model model){
        List<String>listLanguages=this.settingService.listLanguages();
        List<Integer>listSize=this.settingService.listSize();
        model.addAttribute("languages",listLanguages);
        model.addAttribute("size",listSize);
        model.addAttribute("settingEmail", new SettingEmail());
        return "form_email";
    }
    @PostMapping(value = "/form")
    public String goToEmail(@ModelAttribute("settingEmail") SettingEmail settingEmail,Model model){
        model.addAttribute("set",settingEmail);
        return "result";


    }

}
