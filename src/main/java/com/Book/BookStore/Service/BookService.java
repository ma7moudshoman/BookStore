package com.Book.BookStore.Service;

import com.Book.BookStore.Dao.Book;
import com.Book.BookStore.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;

    public BookService(BookRepo bookRepo){
        this.bookRepo=bookRepo;
    }

    public List<Book>allBook(){
        return bookRepo.findAll();
    }
    public Book getBook(long id){
        return bookRepo.findById(id).get();
    }
    public Book saveBook(Book book){
        return bookRepo.save(book);
    }

    public void deleteBook(long id) {
        bookRepo.deleteById(id);
    }
}
