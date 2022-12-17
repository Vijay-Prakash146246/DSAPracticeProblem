package com.api.book.services;

import com.api.book.dao.BookRepository;
import com.api.book.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service //here we can also use @component
public class BookService {
    //Here We are creating fake service
//    private static List<Book> list = new ArrayList<>();
//    static
//    {
//        list.add(new Book(1,"Core Java","Vijay"));
//        list.add(new Book(2,"Advance Java","Niraj"));
//        list.add(new Book(3,"SpringBoot","Sonu"));
//        list.add(new Book(4,"JavaScript","Monu"));
//        list.add(new Book(5,"MySQL","Gopal"));
//    }

    //Code for Accessing data from our database
    @Autowired
    private BookRepository bookRepository;
    //get all books
//    public  List<Book> getAllBooks()
//    {
//        return list;
//    }
    public  List<Book> getAllBooks()
    {
        //Because it will return iterable so we can type caste it
        List<Book> l = (List<Book>) this.bookRepository.findAll();
        return l;
    }

    //get single book by id
//    public  Book getBookById(int id)
//    {
//        Book book=null;
//        //checking one by one each element of our list
//        try {
//            book = list.stream().filter(e->e.getId()==id).findFirst().get();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//        return book;
//    }

    public  Book getBookById(int id)
    {
        Book book=null;
        //checking one by one each element of our list
        try
        {
            book = this.bookRepository.findById(id);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return book;
    }
    //Adding the book
//    public  Book addBook(Book b)
//    {
//        list.add(b);
//        return b;
//    }

    public  Book addBook(Book b)
    {
        Book result = this.bookRepository.save(b);
        return result;
    }

    //delete book
//    public void deleteBook(int bid)
//    {
////      list =   list.stream().filter(book-> {
////           if(book.getId() != bid)
////           {
////               return true;
////           }
////           else
////           {
////               return  false;
////           }
////        }).collect(Collectors.toList());
//
//        //or
//        //list =   list.stream().filter(book-> book.getId()!=bid).collect(Collectors.toList());
//    }


    public void deleteBook(int bid)
    {
           this.bookRepository.deleteById(bid);
    }
//unserstand the below code again
//    public void updateBook(Book b1, int bid1)
//    {
//       list =  list.stream().map(b->{
//           if(b.getId()==bid1)
//           {
//               b.setAuthor(b1.getAuthor());
//               b.setTitle(b1.getTitle());
//               b.setId(b1.getId());
//           }
//           return b;
//        }).collect(Collectors.toList());
//    }


    public void updateBook(Book b1, int bid1)
    {
        //this line of code is for updation purpose
        b1.setId(bid1);
       this.bookRepository.save(b1);
    }

}
