package com.codegym.controller;

import com.codegym.dto.CustomerDto;
import com.codegym.model.entity.customer.Customer;
import com.codegym.model.entity.customer_type.CustomerType;
import com.codegym.model.service.customer_service.CustomerService;
import com.codegym.model.service.customer_type_service.CustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
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


    @GetMapping(value = "/customers-search")
    public String showListCustomerSearch(@RequestParam("search") Optional<String> search,@RequestParam("search1") Optional<String> search1,@RequestParam("search2") Optional<String> search2, Model model, @PageableDefault(value = 1)Pageable pageable) {
        Page<Customer> customers;
        String searchValue="";
        String searchValue1="";
        String searchValue2="";

        if((search.isPresent()) || (search2.isPresent()) || (search2.isPresent()) ){
            searchValue=search.get();
            searchValue1=search1.get();
            searchValue2=search2.get();
            customers=customerServiceImpl.findAllCustomerByThreeColumn( searchValue, searchValue1, searchValue2, pageable);
        }else {
            customers=customerServiceImpl.findAll(pageable);
        }
        model.addAttribute("customers",customers);
        model.addAttribute("searchValue",searchValue);
        model.addAttribute("searchValue1",searchValue1);
        model.addAttribute("searchValue2",searchValue2);
        return "customer/list1";
    }

    @GetMapping(value = "/create-customer")
    public String showCreateCustomer(Model model){
        CustomerDto customerDto=new CustomerDto();
        model.addAttribute("customerDto",customerDto);
        return "customer/create";
    }
    @PostMapping(value = "/save-customer")
    public String saveCustomer(@Valid @ModelAttribute("customerDto") CustomerDto customerDto,BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "customer/create";
        }else {
            Customer customer = new Customer();
           BeanUtils.copyProperties(customerDto,customer);
            customerServiceImpl.save(customer);
            CustomerDto customerDto1 = new CustomerDto();
            model.addAttribute("customerDto", customerDto1);
            model.addAttribute("message", "create Customer success");
            return "customer/create";
        }

    }
    @GetMapping(value = "/edit-customer/{id}")
    public String showEditCustomer(@PathVariable("id") Integer id,Model model){
        Optional<Customer> customer=customerServiceImpl.findById(id);
        CustomerDto customerDto=new CustomerDto();
        BeanUtils.copyProperties(customer.get(),customerDto);
        model.addAttribute("customerDto",customerDto);
        return "customer/edit";
    }
    @PostMapping(value = "/update-customer")
    public String editCustomer(@Valid @ModelAttribute("customerDto") CustomerDto customerDto,BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "customer/edit";
        }else {
            Customer customer=new Customer();
            BeanUtils.copyProperties(customerDto,customer);
            customerServiceImpl.save(customer);
            model.addAttribute("customer",customer);
            model.addAttribute("message","edit Customer success");
            return "customer/edit";
        }


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
