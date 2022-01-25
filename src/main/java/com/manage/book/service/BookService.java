package com.manage.book.service;

import com.manage.book.domain.entity.Book;
import com.manage.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class BookService {

    private static BookRepository bookRepository;

    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }
}
