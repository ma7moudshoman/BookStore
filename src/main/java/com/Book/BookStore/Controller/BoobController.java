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
    //   http://localhost/8080/home
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("name","bgsdfads" );
        return "Home";
    }
    //   http://localhost/8080/book_register

    @GetMapping("/book_register")
    public String book_register(){
        return "BookRegister";

    }
    //   http://localhost/8080/available_booksr

    @GetMapping("/available_books")
    public String getAllBooks( ){
        return"BookList";
    }
    //   http://localhost/8080/save

    @PostMapping("/save")
    public String saveBook(@ModelAttribute ("book")Book book ){
        bookService.saveBook(book);
        return "redirect:/BookRegister";
    }

}