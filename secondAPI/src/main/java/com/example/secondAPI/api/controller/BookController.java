package com.example.secondAPI.api.controller;

import com.example.secondAPI.api.model.Book;
import com.example.secondAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book")
    public Book getBook(int id) {
        Optional book = bookService.getBook(id);
        if(book.isPresent()) {
            return (Book) book.get();
        }
        return null;
    }
}
