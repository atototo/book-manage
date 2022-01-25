package com.manage.book.repository;

import com.manage.book.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAll();

    List<Book> findBookByTitle(String title);

}
