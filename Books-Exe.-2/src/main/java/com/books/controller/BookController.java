package com.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.books.entity.Book;
import com.books.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	// find all books;
	@GetMapping("/books")
	public List<Book> getBooks()
	{
		return this.bookService.getBooks();
		 
	}
	@GetMapping("/books/{bookId}")
	public Book getBook(@PathVariable int bookId) {
		return this.bookService.getBookById(bookId);
		
	}
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return this.bookService.updateBook(book);
	}
	
	@DeleteMapping("/books/{bookId}")
	public Book deleteBook(@PathVariable int bookId) {
		return this.bookService.deleteBook(bookId);
	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}
	
	

}
