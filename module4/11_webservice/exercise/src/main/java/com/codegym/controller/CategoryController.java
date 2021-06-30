package com.codegym.controller;

import com.codegym.model.entity.Category;
import com.codegym.model.service.IBlogService;
import com.codegym.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {
@Autowired
    private ICategoryService categoryService;
@Autowired
    private IBlogService blogService;
@GetMapping("/category")
    public ResponseEntity<Iterable<Category>> showCategory(){
    Iterable<Category> categories=categoryService.findAll();
        return new ResponseEntity<>(categories,HttpStatus.OK);
}



//@GetMapping("/create-category")
//    public String showCreateCategory(Model model){
//    Category category=new Category();
//    model.addAttribute("category",category);
//    return "/category/create";
//}
//@PostMapping("/create-category")
//    public String saveCategory(@ModelAttribute("category" )Category category,Model model){
//    categoryService.save(category);
//    Category category1=new Category();
//    model.addAttribute("category",category1);
//    model.addAttribute("message","create category success");
//    return "/category/create";
//}
//@GetMapping(value="/edit-category/{id}")
//    public String showEditCategory(@PathVariable Integer id, Model model){
//    Optional<Category>category=categoryService.findById(id);
//    model.addAttribute("category",category);
//    return "/category/edit";
//}
//@PostMapping(value ="/edit-category")
//    public String editCategory(@ModelAttribute("category") Category category,Model model){
//    categoryService.save(category);
//    model.addAttribute("category",category);
//    model.addAttribute("message","edit category success");
//    return "/category/edit";
//}
//@GetMapping(value ="/delete-category/{id}")
//public String showDeleteCategory(@PathVariable Integer id, Model model){
//    Optional<Category>category=categoryService.findById(id);
//    model.addAttribute("category",category);
//    return "/category/delete";
//}
//@PostMapping(value ="/delete-category")
//    public String deleteCategory(@ModelAttribute("category")Category category,Model model){
//    categoryService.remove(category.getId());
//    return "redirect:/category";
//}



}
