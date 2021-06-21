package com.codegym.entity;

import javax.persistence.*;

@Entity
@Table
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private int point;
    private String author;
    private String comment;
    private int likes;

    public Comment() {
    }

    public Comment(int id, int point, String author, String comment, int likes) {
        this.id = id;
        this.point = point;
        this.author = author;
        this.comment = comment;
        this.likes = likes;
    }

    public Comment(int point, String author, String comment) {
        this.point = point;
        this.author = author;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
