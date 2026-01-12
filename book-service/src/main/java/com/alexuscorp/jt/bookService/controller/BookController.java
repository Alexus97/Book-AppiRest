package com.alexuscorp.jt.bookService.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexuscorp.jt.bookService.model.Book;
import com.alexuscorp.jt.bookService.service.BookService;





@RestController // Clase tipo controlador
@RequestMapping("api/books") // Ruta por la  cual va a estar escuchando este controlador.
public class BookController {

    // 1 => Forma para inyectar dependencias.
    // @Autowired
    // private BookService bookService;

    // 2 => Forma para realiar Inyeccion de dependencias. con constructor y se coloca el final para que se encapsule mejor.
    private final BookService bookService;
    
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    


    
    @GetMapping  // GET api/books
    public List<Book> getAll() {
        // TODO: Implement method getAll
        // return null;
        return bookService.findAll();
    }

    @GetMapping("/{isbn}") // GET api/books/ id=123456
    public Book getByIsbn(@PathVariable String isbn) {

        // TODO: Implement method getByIsbn
        // return null;
        return bookService.findById(isbn);
    }

    @PostMapping // POST api/books -> Body
    public Book create(@RequestBody Book book) {
        //Todo: Implement method create
        // return null;
        return bookService.create(book);
    }


    @PutMapping("/{isbn}") // PUT api/books/ id=123456 -> Body
    public Book update(@PathVariable String isbn, @RequestBody Book book) {
        // TODO: Implement method update
        // return null;
        return bookService.update(isbn, book);
    }

    @DeleteMapping("/{isbn}") // DELETE api/books/ id=123456
    public void delete(@PathVariable String isbn) {
        // TODO: Implement method update
        // return null;

        bookService.delete(isbn); // llamo al servicio que borre id.
    }

}
