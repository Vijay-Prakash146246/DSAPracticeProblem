package com.api.book.controller;

import com.api.book.entities.Book;
import com.api.book.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@Controller
@RestController //Over come @ResponseBody
public class BookController
{
    @Autowired
    private BookService bookService;
    //@RequestMapping(value = "/books",method = RequestMethod.GET) //this is overcome by @GetMapping()
//    @GetMapping("/books")
//            //If we use @restController annotation then we didn't use @ResponseBody
//    public  Book getBooks()
//    {
//        Book book = new Book(1245,"Learn Code With Vijay ","Vijay Prakash Singh");
//        return book;
//    }

    @GetMapping("/books")
//    public List<Book> getBooks()
    //code for sending the status
    public ResponseEntity<List<Book>> getBooks()
    {
        List<Book> list = this.bookService.getAllBooks();
        if(list.size()<=0)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        else {
            return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }
    }
    //get single book handler
    @GetMapping("/book/{id}")
    public  ResponseEntity<Book> getBook(@PathVariable("id")int id1)
    {
        Book bk =  bookService.getBookById(id1);
        if(bk==null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        else
        {
              return  ResponseEntity.of(Optional.of(bk))  ;
        }

    }
//Here we have required to create handler
    //create book handler
   @PostMapping("/books")
    public  ResponseEntity<Book> addBook(@RequestBody Book book1)
    {
        Book b =null;
        try
        {
            b = this.bookService.addBook(book1);
            return  ResponseEntity.of(Optional.of(b));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        //return b;
    }

    //delete book handler
    @DeleteMapping("/books/{Book_id1}") //Book_id1 nust be saame in both
    public  ResponseEntity<Void> deleteBook(@PathVariable("Book_id1")int Book_id)
    {
        try
        {
            this.bookService.deleteBook(Book_id);
            return  ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        catch (Exception e )
        {
            e.printStackTrace();
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    //update book handler
    @PutMapping("/books/{bookId}")
    public  ResponseEntity<Book> updateBook(@RequestBody Book book1,@PathVariable("bookId") int id1)
    {
        try
        {
            this.bookService.updateBook(book1,id1);
            return  ResponseEntity.ok().body(book1);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        //return book1;
    }
}
