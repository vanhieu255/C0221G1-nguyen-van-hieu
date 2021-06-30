package com.codegym.controller;

import com.codegym.model.entity.Blog;
import com.codegym.model.entity.Category;
import com.codegym.model.service.IBlogService;
import com.codegym.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @ModelAttribute("categorys")
    public Iterable<Category> categorys() {
        return categoryService.findAll();
    }

    @GetMapping(value = "/blogs")

    public ResponseEntity<Page<Blog>> showBlog(Model model, @PageableDefault(value = 2) Pageable pageable) {
        Page<Blog> blog= blogService.findAll(pageable);
        if(blog.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blog,HttpStatus.OK);

    }

//    @GetMapping(value = "/create")
//    public String showCreateBlog(Model model) {
//        Blog blog = new Blog();
//        model.addAttribute("blog", blog);
//        return "create";
//
//    }
//
//    @PostMapping(value = "/create-blog")
//    public String saveBlog(@ModelAttribute("blog") Blog blog, Model model) {
//        blogService.save(blog);
//        Blog blog1 = new Blog();
//        model.addAttribute("blog", blog1);
//        model.addAttribute("message", "create Blog success");
//        return "create";
//    }
//
//    @GetMapping(value = "/edit-blog/{id}")
//    public String showEditBlog(@PathVariable Integer id, Model model) {
//        Optional<Blog> blog = blogService.findById(id);
//        model.addAttribute("blog", blog);
//        return "edit";
//    }
//
//    @PostMapping(value = "/edit-blog")
//    public String updateBlog(@ModelAttribute Blog blog, Model model) {
//        blogService.save(blog);
//        model.addAttribute("blog", blog);
//        model.addAttribute("message", "edit Blog success");
//        return "edit";
//    }
//
//    @GetMapping(value = "/delete-blog/{id}")
//    public String showDeleteBlog(@PathVariable Integer id, Model model) {
//        Optional<Blog> blog = blogService.findById(id);
//        model.addAttribute("blog", blog);
//        return "delete";
//    }
//
//    @PostMapping(value = "/delete-blog")
//    public String removeBlog(@ModelAttribute Blog blog, Model model) {
//        blogService.remove(blog.getId());
//        return "redirect:/blogs";
//    }
    @GetMapping(value = "/view-blog/{id}")
    public  ResponseEntity<Optional<Blog>> showViewBlog(@PathVariable Integer id){
        Optional<Blog> blog=blogService.findById(id);
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }

    @GetMapping(value = "/blog-category/{id}")
    public ResponseEntity<List<Blog>> showBlogCategory(@PathVariable Integer id){
        List<Blog> blogList=blogService.findAllBlogByCategory(id);
       if(blogList.isEmpty()){
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       }
       return  new ResponseEntity<>(blogList,HttpStatus.OK);
    }
}
