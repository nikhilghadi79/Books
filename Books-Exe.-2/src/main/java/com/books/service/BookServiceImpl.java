package com.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.Dao.BookDao;
import com.books.entity.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	public List<Book> getBooks() {
		return bookDao.findAll();

	}

	@Override
	public Book getBookById(int bookId) {

		return bookDao.getOne(bookId);
	}

	@Override
	public Book updateBook(Book book) {

		 bookDao.save(book);
		 return book;
	}

	@Override
	public Book deleteBook(int bookId) {
		Book entity = bookDao.getOne(bookId);
	bookDao.delete(entity);
	return null;

	}

	@Override
	public Book addBook(Book book) {
		bookDao.save(book);
		return book;
	}

}
