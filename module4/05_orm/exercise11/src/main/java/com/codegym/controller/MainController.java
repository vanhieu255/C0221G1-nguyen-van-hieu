package com.codegym.controller;

import com.codegym.entity.Comment;
import com.codegym.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller

public class MainController {
    @Autowired
    private CommentService commentService;



    @GetMapping(value ="")
    public String showCreateComment(Model model){
        model.addAttribute("comment",new Comment());
        List<Comment> commentList=commentService.findAll();
        model.addAttribute("commentList",commentList);
        return "home";
    }
    @PostMapping(value = "/save")
    public String saveComment(Model model, Comment comment){
        commentService.save(comment);
        return "home";
    }
    @GetMapping(value ="/like/{id}")
    public String addLike(@PathVariable int id){
        Comment comment=commentService.findOne(id);
        comment.setLikes(comment.getLikes()+1);
        commentService.update(comment);
        return "redirect:/";
    }




}
