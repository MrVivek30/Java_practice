package com.ui;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.dao.BookDao;
import com.dao.BookDaoImpl;
import com.dto.Book;
import com.exception.BookException;

public class Main {
	public static void main(String[] args) throws BookException {
		
		BookDao bookDao=new BookDaoImpl();
		Scanner scanner =new Scanner(System.in);
		
		int choice=0;
		
		do {
			System.out.println("1.Get the information of any particular book by id");
			System.out.println("2.Create a new Book");
			System.out.println("3.Delete Book by ID");
			System.out.println("4.Update Book by ID by doubling the price");
			System.out.println("0.Exit");
			System.out.println("Enter Choice");
			
			choice =scanner.nextInt();
			
			if(choice==1) {
				System.out.println("Enter book id");
				int id=scanner.nextInt();
				System.out.println(bookDao.getinfoofBook(id));
			
			}else if(choice==2) {
			System.out.println("Enter book id");
			int id=scanner.nextInt();
			System.out.println("enter Book name");
			String nameString=scanner.next();
			System.out.println("enter book Author");
			String auString=scanner.next();
			System.out.println("enter book publication");
			String pubString=scanner.next();
			System.out.println("enter book categorry");
			String catString=scanner.next();
			System.out.println("enter book pages");
			int pg=scanner.nextInt();
			System.out.println("enter book price");
			int pri=scanner.nextInt();
//			System.out.println("enter timestamp");
			bookDao.addBook(new Book(id,nameString,auString,pubString,catString,pg,pri,LocalDateTime.now()));
				
			}else if(choice==3) {
				
				System.out.println("Enter book id");
				int id=scanner.nextInt();
				System.out.println(bookDao.deleteBook(id));
			}else if(choice==4) {
				System.out.println("Enter book id");
				int id=scanner.nextInt();
				System.out.println(bookDao.updateBook(id));
			}
			
			
		}while(choice!=0);
		scanner.close();
	}
	
	
}
