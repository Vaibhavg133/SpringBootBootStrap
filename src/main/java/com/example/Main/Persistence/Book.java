package com.example.Main.Persistence;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false,unique = true)
    private String author;
    @Column(nullable = false)
    private String title;
    public long getId(){
        return id;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public void setId(long id){
        this.id=id;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setTitle(String title){
        this.title=title;
    }
}
