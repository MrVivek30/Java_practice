package com.dao;

import javax.persistence.EntityManager;

import com.dto.Book;



public class BookDaoImpl implements BookDao {

	public Book getinfoofBook(int id) {
	
		EntityManager entityManager=EmUtils.getConnection();
		Book book=entityManager.find(Book.class, id);
		if(book==null) {
			System.out.println("Not Found");
		}
		
		return book;
	}

	public void addBook(Book book) {
		EntityManager eManager=	EmUtils.getConnection();
		eManager.getTransaction().begin();
		eManager.persist(book);
		System.out.println("Book Added Successfully");
		eManager.getTransaction().commit();
		eManager.close();
		
	}

	public boolean deleteBook(int id) {
		boolean flag=false;
		
		EntityManager entityManager=EmUtils.getConnection();
		Book book=entityManager.find(Book.class, id);
		
		if(book!=null) {
		entityManager.getTransaction().begin();
		entityManager.remove(book);
		flag=true;
		entityManager.getTransaction().commit();
		}
		entityManager.close();
		return flag;
	}

	public String updateBook(int id) {
		String msgString="double price updated Successfully";
		EntityManager eManager=EmUtils.getConnection();
		eManager.getTransaction().begin();
		
		Book book=eManager.find(Book.class, id);
		if(book==null) {
			msgString="double price NOT updated ";
		}
		book.setPrice(book.getPrice()*2);
		eManager.getTransaction().commit();
		eManager.close();
		
		
		return msgString;
	}

}
