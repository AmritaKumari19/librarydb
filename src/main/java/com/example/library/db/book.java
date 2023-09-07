package com.example.library.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_table")
public class book {
    @Id
    private int id;
    private String name;
    private int pages;
    private String Author;
        public  book(int id ,String name,int pages,String Author){
            this.id=id;
            this.name=name;
            this.pages=pages;
            this.Author=Author;
        }
        public book(){

        }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
            return Author;
    }
}
