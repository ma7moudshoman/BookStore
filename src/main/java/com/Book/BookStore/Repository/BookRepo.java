package com.Book.BookStore.Repository;

import com.Book.BookStore.Dao.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
}
