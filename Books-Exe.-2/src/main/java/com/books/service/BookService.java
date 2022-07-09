package com.books.service;

import java.util.List;

import com.books.entity.Book;

public interface BookService {

	public 	List<Book> getBooks();

	public Book getBookById(int bookId);

	public Book updateBook(Book book);

	public Book deleteBook(int bookId);

	public Book addBook(Book book);
	
	public Book searchBook(Book book);

}
