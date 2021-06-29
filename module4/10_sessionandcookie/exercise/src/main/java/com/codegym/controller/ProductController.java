package com.codegym.controller;

import com.codegym.model.entity.Cart;
import com.codegym.model.entity.Product;
import com.codegym.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController  {
    @Autowired
    private IProductService productService;


    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }


    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }
    @GetMapping(value = "/view-product/{id}")
    public String showProduct(@PathVariable Long id, Model model){
        Product product=productService.findById(id).orElse(null);
        model.addAttribute("product",product);
        return "detail";


    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("show")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        if(action.equals("sub")){
            cart.subProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
//        if(action.equals("delete")){
//            cart.deleteProductInCart(productOptional.get());
//            return "redirect:/shopping-cart";
//        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }
    @GetMapping(value = "delete/{id}")
    public String deleteProductInCart(@ModelAttribute Cart cart,@PathVariable Long id,Model model){
        cart.deleteProductInCart(productService.findById(id).get());
        return "redirect:/shopping-cart";
    }
}
