package com.codegym.controller;

import com.codegym.model.entity.Product;
import com.codegym.model.service.IProductService;
import com.codegym.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @GetMapping(value = "")
    public String showList(@RequestParam("search") Optional<String> search, Model model, @PageableDefault(value = 2) Pageable pageable){
        Page<Product> product;
        String searchValue="";
        if(search.isPresent()){
            searchValue=search.get();
            product = iProductService.SearchProductByNameAndPrice(pageable,searchValue);

        } else {
            product = iProductService.findAll(pageable);
        }
        model.addAttribute("products",product);
        model.addAttribute("searchValue",searchValue);
        return "list";

    }
    @GetMapping(value = "/create")
    public String showCreateForm(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping(value = "/save")
    public String save(Model model, Product product, RedirectAttributes redirectAttributes){
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("success","Create new Product success");
        return "redirect:/";
    }
    @GetMapping(value = "/edit/{id}")
    public String showEditForm(@PathVariable int id,Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "edit";
    }
    @PostMapping(value = "/update")
    public String update(Product product, RedirectAttributes redirectAttributes){
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("success","edit success");
        return "redirect:/";
    }
    @PostMapping(value ="/delete")
    public String showDeleteForm(@RequestParam int id,RedirectAttributes redirectAttributes){
      iProductService.remove(id);
      redirectAttributes.addFlashAttribute("success","delete success");
        return "redirect:/";
    }

    @GetMapping(value = "/view/{id}")
    public String showViewForm(@PathVariable int id ,Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "view";
    }
//    @PostMapping(value = "/search")
//    public String search(@RequestParam("search") Optional<String> search, Model model, @PageableDefault(value = 2) Pageable pageable){
//        Page<Product> product;
//        String searchValue="";
//        if(search.isPresent()){
//            searchValue=search.get();
//            product = iProductService.findAllByNameProductContaining(searchValue, pageable);
//
//        } else {
//            product = iProductService.findAll(pageable);
//        }
//        model.addAttribute("product",product);
//        model.addAttribute("searchValue",searchValue);
//        return "list";
//
//    }

}
