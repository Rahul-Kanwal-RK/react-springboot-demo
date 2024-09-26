package com.example.secondAPI.service;

import com.example.secondAPI.api.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private List<Book> BookList;

    public BookService() {
        BookList = new ArrayList<Book>();
        BookList.add(new Book(1, "The White Tiger", "Aravind Adiga"));
        BookList.add(new Book(2, "Tomorrow and Tomorrow and Tomorrow", "Gabrielle Zevin"));
        BookList.add(new Book(3, "Turtles all the way Down", "John Green"));
        BookList.add(new Book(4, "November 9", "Colleen Hoover"));
        BookList.add(new Book(5, "Digital Fortress", "Dan Brown"));
    }

    public Optional<Book> getBook(int id) {
        Optional optional = Optional.empty();
        for (Book book : BookList) {
            if (book.getId() == id) {
                optional = Optional.of(book);
                return optional;
            }
        }
        return optional;
    }
}
