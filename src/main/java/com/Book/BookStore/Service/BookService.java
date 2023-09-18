package com.Book.BookStore.Service;

import com.Book.BookStore.Dao.Book;
import com.Book.BookStore.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;
    public  BookService(BookRepo bookRepo){
        super();
        this.bookRepo=bookRepo;
    }

    public Book saveBook(Book book){
        return bookRepo.save(book);
    }




}
