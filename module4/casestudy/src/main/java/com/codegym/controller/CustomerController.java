package com.codegym.controller;

import com.codegym.model.entity.customer.Customer;
import com.codegym.model.entity.customer_type.CustomerType;
import com.codegym.model.service.customer_service.CustomerService;
import com.codegym.model.service.customer_type_service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerServiceImpl;
    @Autowired
    private CustomerTypeService customerTypeServiceImpl;




    @ModelAttribute("customerTypes")
    public Iterable<CustomerType> customerTypes() {
        return customerTypeServiceImpl.findAll();
    }


    @GetMapping(value = "/customers")
    public String showListCustomer(@RequestParam("search") Optional<String> search, Model model, @PageableDefault(value = 2)Pageable pageable) {
        Page<Customer> customers;
        String searchValue="";
        if(search.isPresent()){
            searchValue=search.get();
            customers=customerServiceImpl.findAllByCustomerNameContaining(searchValue,pageable);
        }else {
            customers=customerServiceImpl.findAll(pageable);
        }
        model.addAttribute("customers",customers);
        model.addAttribute("searchValue",searchValue);
        return "customer/list";
    }

    @GetMapping(value = "/create-customer")
    public String showCreateCustomer(Model model){
        Customer customer=new Customer();
        model.addAttribute("customer",customer);
        return "customer/create";
    }
    @PostMapping(value = "/save-customer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer,Model model){
        customerServiceImpl.save(customer);
        Customer customer1=new Customer();
        model.addAttribute("customer",customer1);
        model.addAttribute("message","create Customer success");
        return "customer/create";
    }
    @GetMapping(value = "/edit-customer/{id}")
    public String showEditCustomer(@PathVariable("id") Integer id,Model model){
        Optional<Customer> customer=customerServiceImpl.findById(id);
        model.addAttribute("customer",customer);
        return "customer/edit";
    }
    @PostMapping(value = "/update-customer")
    public String editCustomer(@ModelAttribute Customer customer,Model model){
        customerServiceImpl.save(customer);
        model.addAttribute("customer",customer);
        model.addAttribute("message","edit Customer success");
        return "customer/edit";
    }
    @PostMapping(value = "/delete-customer")
    public String deleteCustomer(@RequestParam Integer id, RedirectAttributes redirectAttributes){
        Optional<Customer> customer=customerServiceImpl.findById(id);
        customer.get().setFlag(false);
        customerServiceImpl.save(customer.get());
        redirectAttributes.addFlashAttribute("message","delete success");
        return "redirect:/customers";
    }


}
