package com.codegym.model.entity;



import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;


    @OneToMany(targetEntity = Blog.class)
    private List<Blog> blog;

    public Category() {
    }

    public Category(String name, List<Blog> blog) {
        this.name = name;
        this.blog = blog;
    }

    public Category(Integer id, String name, List<Blog> blog) {
        this.id = id;
        this.name = name;
        this.blog = blog;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlog() {
        return blog;
    }

    public void setBlog(List<Blog> blog) {
        this.blog = blog;
    }

}
