package com.dao;

import com.dto.Book;

public interface BookDao {
public Book getinfoofBook(int id);
public void addBook(Book book);
public boolean deleteBook(int id);
public String updateBook(int id);
}
