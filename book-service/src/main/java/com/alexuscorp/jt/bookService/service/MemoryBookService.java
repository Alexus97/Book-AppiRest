package com.alexuscorp.jt.bookService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alexuscorp.jt.bookService.model.Book;


@Service
public class MemoryBookService implements BookService {

    private List<Book> books = new ArrayList<>();

    @Override
    public List<Book> findAll() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'findAll'");
        return books;
    }


    @Override
    public Book findById(String id) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'findById'");
        // for(Book book : books) {
        //     if(book.getIsbn().equals(id)) {
        //         return book;
        //     }
        // }
        // return null;

        return books.stream()
                //.peek(System.out::println) -> si quiero que me imprima cada uno de los elementos.
                .filter(book -> book.getIsbn().equals(id))
                .findFirst()
                .orElse(null);
    
    }

    @Override
    public Book create(Book info) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'create'");
        books.add(info);
        return info;
    }

    @Override
    public Book update(String id, Book info) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'update'");
        // Book existingBook = findById(id);
        // if (existingBook != null) {
        //     existingBook.setTitle(info.getTitle());
        //     existingBook.setAuthor(info.getAuthor());
        //     existingBook.setPrice(info.getPrice());
        // }
        // var book = books.stream()
        //         .filter(b -> b.getIsbn().equalsIgnoreCase(id))
        //         .findFirst()
        //         .orElse(null); ==> esto reealia el mismo proceso que findById.

        var book = findById(id);
        if (book != null) {
            book.setIsbn(info.getIsbn());
            book.setTitle(info.getTitle());
            book.setAuthor(info.getAuthor());
        }
        return book;
    }

    @Override
    public void delete(String id) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'delete'");
        // var book = findById(id);
        // books.remove(book);
        // usando lambda.
        books = books.stream()
                .filter(book -> !book.getIsbn().equalsIgnoreCase(id))
                .toList();
    }










}