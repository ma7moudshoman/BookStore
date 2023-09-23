package com.Book.BookStore.Repository;

import com.Book.BookStore.Dao.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookListRepo extends JpaRepository<MyBookList,Integer> {
}
