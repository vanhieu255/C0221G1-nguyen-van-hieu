package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import com.codegym.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    private IProductService iProductService=new ProductService();
    @GetMapping(value = "")
    public String showList(Model model){
        List<Product>products=iProductService.findAll();
        model.addAttribute("products",products);
        return "list";

    }
    @GetMapping(value = "/create")
    public String showCreateForm(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping(value = "/save")
    public String save(Model model, Product product, RedirectAttributes redirectAttributes){
        product.setId((int) (Math.random()*1000));
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("success","Create new Product success");
        return "redirect:/";
    }
    @GetMapping(value = "{id}/edit")
    public String showEditForm(@PathVariable int id,Model model){
        model.addAttribute("product",iProductService.findById(id));

        return "edit";
    }
    @PostMapping(value = "/update")
    public String update(Product product, RedirectAttributes redirectAttributes){
        iProductService.update(product.getId(),product);
        redirectAttributes.addFlashAttribute("success","edit success");
        return "redirect:/";
    }
    @PostMapping(value ="/delete")
    public String showDeleteForm(@RequestParam int id,RedirectAttributes redirectAttributes){
      iProductService.remove(id);
      redirectAttributes.addFlashAttribute("success","delete success");
        return "redirect:/";
    }
//    @PostMapping(value = "/remove")
//    public String remove(Product product,RedirectAttributes redirectAttributes){
//        iProductService.remove(product.getId());
//        redirectAttributes.addFlashAttribute("success","delete product success");
//        return "redirect:/";
//    }
    @GetMapping(value = "/{id}/view")
    public String showViewForm(@PathVariable int id ,Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "view";
    }
    @PostMapping(value = "/search")
    public String search(@RequestParam String nameProduct, Model model){
        List<Product>
        list=iProductService.findByName(nameProduct);
        model.addAttribute("products",list);
        return "list";


    }

}
