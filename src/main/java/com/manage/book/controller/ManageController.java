package com.manage.book.controller;

import com.manage.book.domain.dto.BookDto;
import com.manage.book.domain.entity.Book;
import com.manage.book.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ManageController {

    private static BookService bookService;

    @GetMapping("/all-book")
    public ResponseEntity<List<Book>> getAllBook(){

        var bookList = bookService.findAllBooks();


        return new ResponseEntity<>( bookList , HttpStatus.OK);
    }

    @GetMapping("/book-title/{title}")
    public ResponseEntity<List<Book>> getAllBookByTitle(@PathVariable(name = "title") Long title){
        return new ResponseEntity<>( bookService.findAllBooks(), HttpStatus.OK);
    }

}
