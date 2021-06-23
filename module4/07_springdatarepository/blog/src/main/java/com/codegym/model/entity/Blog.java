package com.codegym.model.entity;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    private String opinion;
    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name = "catelogy_id")
    private Category category;

    public Blog() {
    }

    public Blog(String title, String content, String opinion, Category category) {
        this.title = title;
        this.content = content;
        this.opinion = opinion;
        this.category = category;
    }

    public Blog(Integer id, String title, String content, String opinion, Category category) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.opinion = opinion;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}


