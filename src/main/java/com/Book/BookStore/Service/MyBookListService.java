package com.Book.BookStore.Service;

import com.Book.BookStore.Dao.MyBookList;
import com.Book.BookStore.Repository.MyBookListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {
@Autowired
   private  MyBookListRepo myBookListRepo;

@Autowired
    public MyBookListService(MyBookListRepo myBookListRepo){
    super();
    this.myBookListRepo=myBookListRepo;
}
public MyBookList saveMyBooks(MyBookList myBookList) {
    return  myBookListRepo.save(myBookList);
}
public List<MyBookList>AllMyBooks(){
    return myBookListRepo.findAll();
}
public void deleteBook(long id){
    myBookListRepo.deleteById((int) id);
}

}
