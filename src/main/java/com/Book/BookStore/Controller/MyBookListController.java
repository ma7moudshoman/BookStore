package com.Book.BookStore.Controller;

import com.Book.BookStore.Service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;

@Controller
public class MyBookListController {
    @Autowired
    MyBookListService myBookListService;

    //   http://localhost:8080/myBooks

    @GetMapping("/myBooks")
    public String myBooks(){
    return "myBooks";
}
 public String Books (Model model){
        model.addAttribute("Books", myBookListService.AllMyBooks());
        return "redirect:/myBooks";
 }

   // http://localhost:8080/deleteMylist
@GetMapping("deleteMylist")
public String deleteBook(@PathParam("id") int id){
        myBookListService.deleteBook(id);
        return "redirect:/my_books";
}

}
