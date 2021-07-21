package com.codegym.controller;

import com.codegym.dto.QuestionDto;
import com.codegym.model.entity.Question;
import com.codegym.model.entity.QuestionType;
import com.codegym.model.service.QuestionService;
import com.codegym.model.service.QuestionTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionServiceImpl;
    @Autowired
    private QuestionTypeService questionTypeServiceImpl;
    @ModelAttribute("questionTypes")
    public Iterable<QuestionType> questionTypes() {
        return questionTypeServiceImpl.findAll();
    }



    @GetMapping(value = "/questions")
    public String showListQuestion(@RequestParam("search") Optional<String> search, @RequestParam("search1") Optional<String> search1, Model model, @PageableDefault(value = 10) Pageable pageable) {
        Page<Question> questions;
        String searchValue="";
        String searchValue1="";

        if((search.isPresent()) || (search1.isPresent()) ){
            searchValue=search.get();
            searchValue1=search1.get();
            questions=questionServiceImpl.findAllQuestionByTwoColumn(searchValue, searchValue1, pageable);
        }else {
           questions=questionServiceImpl.fin1(pageable);
        }
        model.addAttribute("questions",questions);
        model.addAttribute("searchValue",searchValue);
        model.addAttribute("searchValue1",searchValue1);
        return "list";
    }

    @GetMapping(value = "/create-question")
    public String showCreateQuestion(Model model){
        QuestionDto questionDto =new QuestionDto();
        model.addAttribute("questionDto",questionDto);
        return "create";
    }
    @PostMapping(value = "/save-question")
    public String saveQuestion(@Valid @ModelAttribute("questionDto") QuestionDto questionDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "create";
        } else {
            Question question = new Question();
            BeanUtils.copyProperties(questionDto, question);
            questionServiceImpl.save(question);
            QuestionDto questionDto1 = new QuestionDto();
            model.addAttribute("questionDto", questionDto1);
            model.addAttribute("message", "create Question success");
            return "create";
        }
    }
    @GetMapping(value = "/edit-question/{id}")
    public String showEditQuestion(@PathVariable("id") Integer id, Model model){
        Optional<Question> question=questionServiceImpl.findById(id);
        QuestionDto questionDto=new QuestionDto();
        BeanUtils.copyProperties(question.get(),questionDto);
        model.addAttribute("questionDto",questionDto);
        return "edit";
    }
    @PostMapping(value = "/update-question")
    public String editCustomer(@Valid @ModelAttribute("questionDto") QuestionDto questionDto,BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "edit";
        }else {
            Question question=new Question();
            BeanUtils.copyProperties(questionDto,question);
            questionServiceImpl.save(question);
            model.addAttribute("question",question);
            model.addAttribute("message","edit Question success");
            return "edit";
        }


    }
    @GetMapping(value = "/delete-question")
    public String deleteQuestion(@RequestParam Integer id, RedirectAttributes redirectAttributes){
        Optional<Question> question=questionServiceImpl.findById(id);
        questionServiceImpl.remove(question.get().getId());

        redirectAttributes.addFlashAttribute("message","delete success");
        return "redirect:/questions";
    }













}
