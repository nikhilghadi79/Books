package com.books.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.entity.Book;

public interface BookDao extends JpaRepository<Book, Integer> {

}
