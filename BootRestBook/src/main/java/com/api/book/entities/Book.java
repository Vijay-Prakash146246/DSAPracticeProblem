package com.api.book.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private  String title;
    //Create Author as a non preemitive data type or we can say that object type data
    //private String author;
   //for creating One-One RelationShip unidiractional(Book have Author)
    @OneToOne(cascade = CascadeType.ALL) //cascade = CascadeType.ALL this will perform all the related operation automatically
    private Author author;

    public Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
