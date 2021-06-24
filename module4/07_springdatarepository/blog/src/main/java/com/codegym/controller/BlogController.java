package com.codegym.controller;

import com.codegym.model.entity.Blog;
import com.codegym.model.entity.Category;
import com.codegym.model.service.IBlogService;
import com.codegym.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class BlogController {
@Autowired
    private IBlogService blogService;
@Autowired
private ICategoryService categoryService;

    @ModelAttribute("categorys")
    public Iterable<Category> categorys(){
        return categoryService.findAll();
    }
@GetMapping(value = "/blogs")

    public String showBlog(@RequestParam("search") Optional<String> search, Model model, @PageableDefault(value = 2) Pageable pageable){
    Page<Blog> blog;
    String searchValue="";
    if(search.isPresent()){
        searchValue=search.get();
        blog = blogService.findAllByTitleContaining(searchValue, pageable);


    } else {
        blog = blogService.findAll(pageable);
    }
    model.addAttribute("blog",blog);
    model.addAttribute("searchValue",searchValue);
    return "list";

}
@GetMapping(value="/create")
    public String showCreateBlog(Model model){
    Blog blog=new Blog();
    model.addAttribute("blog",blog);
    return "create";

}
@PostMapping(value ="/create-blog")
    public String saveBlog(@ModelAttribute("blog") Blog blog,Model model){
    blogService.save(blog);
    Blog blog1=new Blog();
    model.addAttribute("blog",blog1);
    model.addAttribute("message","create Blog success");
    return "create";
}

@GetMapping(value = "/edit-blog/{id}")
    public String showEditBlog(@PathVariable Integer id, Model model){
    Optional<Blog> blog=blogService.findById(id);
    model.addAttribute("blog",blog);
    return "edit";
}
@PostMapping(value = "/edit-blog")
    public String updateBlog(@ModelAttribute Blog blog, Model model){
    blogService.save(blog);
    model.addAttribute("blog",blog);
    model.addAttribute("message","edit Blog success");
    return "edit";
}
@GetMapping(value = "/delete-blog/{id}")
    public String showDeleteBlog(@PathVariable Integer id ,Model model){
    Optional<Blog> blog =blogService.findById(id);
    model.addAttribute("blog",blog);
    return "delete";
}
@PostMapping(value="/delete-blog")
    public String removeBlog(@ModelAttribute Blog blog,Model model){
    blogService.remove(blog.getId());
    return "redirect:/blogs";
}
}
