package com.alexuscorp.jt.bookService.service;

import java.util.List;

import com.alexuscorp.jt.bookService.model.Book;

public interface BookService {
    List<Book> findAll();

    Book findById( String id );

    Book create( Book info);
    
    Book update(String id, Book info);

    void delete(String id);


}
