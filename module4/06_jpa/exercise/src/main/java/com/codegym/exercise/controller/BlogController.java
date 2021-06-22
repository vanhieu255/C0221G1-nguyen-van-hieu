package com.codegym.exercise.controller;

import com.codegym.exercise.model.entity.Blog;
import com.codegym.exercise.model.repository.IBlogRepository;
import com.codegym.exercise.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BlogController {
@Autowired
    private IBlogService blogService;
@GetMapping(value = "")
    public String showBlog(Model model){
    List<Blog> blog=blogService.findAll();

    model.addAttribute("blog",blog);
    return "list";

}
@GetMapping(value="/create")
    public String showCreateBlog(Model model){
    Blog blog=new Blog();
    model.addAttribute("blog",blog);
    return "create";

}
@PostMapping(value = "/create-blog")
    public String saveBlog(@ModelAttribute("blog") Blog blog,Model model){
    blogService.save(blog);
    model.addAttribute("blog",new Blog());
    model.addAttribute("message","create Blog success");
    return "create";
}

@GetMapping(value = "/edit-blog/{id}")
    public String showEditBlog(@PathVariable int id, Model model){
    Blog blog=blogService.findById(id);
    model.addAttribute("blog",blog);
    return "edit";
}
@PostMapping(value = "/edit-blog")
    public String updateBlog(@ModelAttribute Blog blog, Model model){
    blogService.update(blog);
    model.addAttribute("blog",blog);
    model.addAttribute("message","edit Blog success");
    return "edit";
}
@GetMapping(value = "/delete-blog/{id}")
    public String showDeleteBlog(@PathVariable int id ,Model model){
    Blog blog =blogService.findById(id);
    model.addAttribute("blog",blog);
    return "delete";
}
@PostMapping(value="/delete-blog")
    public String removeBlog(@ModelAttribute Blog blog,Model model){
    blogService.remove(blog.getId());
    return "redirect:/";
}
}
