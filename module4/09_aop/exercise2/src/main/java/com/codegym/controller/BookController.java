package com.codegym.controller;

import com.codegym.model.entity.Book;
import com.codegym.model.entity.Customer;
import com.codegym.model.service.IBookService;
import com.codegym.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    ICustomerService customerService;
    @GetMapping(value = "/book")
    public String showListBook(Model model, @PageableDefault(value = 2) Pageable pageable){
        Page<Book> books= bookService.findAll(pageable);
        model.addAttribute("books",books);
        return "book/list";
    }
    @GetMapping(value = "/borrow/{id}")
    public String showBorrowBook(@PathVariable int id,Model model){
        model.addAttribute("books",bookService.findById(id));
        return "book/borrow";
    }
    @PostMapping(value="borrow-book")
    public String borrowBook(@ModelAttribute("books") Book books, Model model, @RequestParam String nameCustomer) {
        if (books.getQuantity() > 0) {

            int code = (int) Math.floor(Math.random() * 10000);

            books.setQuantity(books.getQuantity() - 1);
            bookService.save(books);

            Customer customer=new Customer();
            customer.setNameCustomer(nameCustomer);
            customer.setCode(Integer.toString(code));
            customer.setBook(books);
            customerService.save(customer);
            model.addAttribute("code", code);

            return "book/showcode";
        }else {
            return "book/error";
        }

    }
    @GetMapping(value = "/pay/{id}")
    public String showPay(@PathVariable int id){

        return "book/pay";
    }
    @PostMapping(value = "/pay-book")
    public String Pay(@RequestParam String code,Model model,Pageable pageable) {
        Page<Customer> customer = customerService.findAll(pageable);
        Book book = new Book();
        boolean check=false;
        for (Customer c : customer) {
            if (c.getCode().equals(code)) {
                check=true;
                break;
            }
        }
        if(check==true){
            Optional<Customer> customer1 = customerService.findByCode(code);
            book = customer1.get().getBook();
            book.setQuantity(book.getQuantity() + 1);
            bookService.save(book);

             return "redirect:/book";
        }else {
            return "book/error";
        }

    }


}
