package com.Book.BookStore.Controller;

import com.Book.BookStore.Service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

}
