package com.codegym.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameCustomer;
    private String code;
    @ManyToOne
    @JoinColumn(name = "book_id",referencedColumnName ="id")
    private Book book;

    public Customer() {
    }

    public Customer(Integer id, String nameCustomer, String code, Book book) {
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.code = code;
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
