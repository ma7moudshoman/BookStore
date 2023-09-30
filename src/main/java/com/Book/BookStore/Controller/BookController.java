package com.Book.BookStore.Controller;

import com.Book.BookStore.Dao.Book;
import com.Book.BookStore.Dao.MyBookList;
import com.Book.BookStore.Service.BookService;
import com.Book.BookStore.Service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    BookService bookService;
    @Autowired
    MyBookListService myBookListService;
    @Autowired
    public BookController(BookService bookService){
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

    //   http://localhost:8080/my_books
    @PostMapping("/my_books")
    public String saveBook(@ModelAttribute MyBookList myBookList){
        myBookListService.saveMyBooks(myBookList);
        return "redirect:/myBooks";
    }
    //   http://localhost:8080/book
    @GetMapping("/book")
    public String MyBookLis(Model model){
        model.addAttribute("Books",myBookListService.AllMyBooks());
        return "myBooks";
    }
    //   http://localhost:8080/mylist/{id}

    @GetMapping("/mylist/{id}")
    public String saveMyBooks(@ModelAttribute("id") int id, MyBookList myBookList){
        myBookList.save(myBookList);
        return  "redirect:/my_books";
    }
}
