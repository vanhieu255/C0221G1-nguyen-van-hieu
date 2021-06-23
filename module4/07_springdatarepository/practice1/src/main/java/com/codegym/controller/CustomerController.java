package com.codegym.controller;

import com.codegym.model.entity.Customer;
import com.codegym.model.entity.Province;
import com.codegym.model.service.ICustomerService;
import com.codegym.model.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {
@Autowired
    private ICustomerService customerService;
@Autowired
private IProvinceService provinceService;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }

@GetMapping(value = "/create-customer")
    public String showCreateForm(Model model){
    Customer customer=new Customer();
    model.addAttribute("customer",customer);
    return "/customer/create";
    }
@PostMapping(value = "/create-customer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer,Model model){
    customerService.save(customer);
    Customer customer1=new Customer();
    model.addAttribute("customer",customer1);
    model.addAttribute("message","create customer success");
    return "/customer/create";
}
@GetMapping(value ="/customers")
    public String listCustomer(@RequestParam("search") Optional<String> search, Model model, Pageable pageable){
    Page<Customer> customers;
    if(search.isPresent()){
        customers = customerService.findAllByFirstNameContaining(search.get(), pageable);
    } else {
        customers = customerService.findAll(pageable);
    }
    model.addAttribute("customer",customers);
    return "/customer/list";
}
    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customer", customer.get());
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Optional<Customer> customer = customerService.findById(id);
        if (customer.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/customer/delete");
            modelAndView.addObject("customer", customer.get());
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.remove(customer.getId());
        return "redirect:customers";
    }




}
