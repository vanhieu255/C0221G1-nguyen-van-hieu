package com.codegym.model.entity;

import javax.persistence.*;

@Entity(name = "product3")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameProduct;
    private int price;
    @Column(name="describes")
    private String describe;
    private String producer;

    public Product() {
    }

    public Product(String nameProduct, int price, String describe, String producer) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.describe = describe;
        this.producer = producer;
    }

    public Product(Integer id, String nameProduct, int price, String describe, String producer) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.describe = describe;
        this.producer = producer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
