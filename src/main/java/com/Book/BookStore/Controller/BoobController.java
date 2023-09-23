package com.Book.BookStore.Controller;

import com.Book.BookStore.Dao.Book;
import com.Book.BookStore.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoobController {

    @Autowired
    BookService bookService;
    @Autowired
    public BoobController(BookService bookService){
        super();
        this.bookService=bookService;
    }


    //   http://localhost:8080/
    @GetMapping("/")
    public String Home(){
        return "Home";
    }
//    http://localhost:8080/book_register
    @GetMapping("/book_register")
    public String BookRegister(){
        return "BookRegister";
    }

    //   http://localhost:8080/available_Books
    @GetMapping("/available_Books")
    public String getAllBooks(){
        return "BookList";
    }


    //   http://localhost:8080/save

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book ){
        bookService.saveBook(book);
        return "redirect:/available_Books";
    }


    //   http://localhost:8080/books
    @GetMapping("/books")
    public String books(Model model){
        model.addAttribute("books", bookService.allBook());
        return "BookList";
    }
}
