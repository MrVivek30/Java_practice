package com.masai.ui;

import java.util.List;
import java.util.Scanner;

import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomeThingWentWrongException;
import com.masai.dao.CategoryOperation;
import com.masai.dao.CategoryOperationImpl;
import com.masai.dto.Category;
import com.masai.dto.CategoryImpl;

public class CategoryUI {

	
	CategoryOperation cp;
	Scanner sc;
	public CategoryUI(Scanner sc) {
		cp=new CategoryOperationImpl();
		this.sc = sc;
	}
	public void addcat() {
		System.out.println("Enter category id ");
		int cat_id=sc.nextInt();
		System.out.println("enter category name");
		String cat_name=sc.next();
		Category cat=new CategoryImpl(cat_id,cat_name);
		
		try {
			cp.addCategory(cat);
			
			System.out.println("category aadded successfully  " );
		} catch (SomeThingWentWrongException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void viewAll() throws NoRecordFoundException, SomeThingWentWrongException {
		List<Category>list=cp.getAllCat();
		list.forEach(System.out::println);
//		System.out.println(cp.getAllCat());
	}
	public void update() {
		System.out.println("Enter category id ");
		int cat_id=sc.nextInt();
		System.out.println("enter category name");
		String cat_name=sc.next();
		Category cat=new CategoryImpl(cat_id,cat_name);
		try {
			cp.updateCategory(cat);
		} catch (SomeThingWentWrongException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void delete() {
		
		System.out.println("Eneter cat_id you want to delete");
		int cat_id=sc.nextInt();
		try {
			cp.deleteCategory(cat_id);
		} catch (SomeThingWentWrongException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void searchbyname() {
		System.out.println("eneter cat_name  to search");
		String cat_name=sc.next();
		
		try {
			List<Category>list=cp.getCategoriesbyName(cat_name);
			list.forEach(System.out::println);
		} catch (NoRecordFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	public void searchbyid() {
			System.out.println("Eneter cat_id to search");
		int cat_id=sc.nextInt();
		
	System.out.println(	cp.getCategorybyid(cat_id));
			
		}
	
//	/*******************************************
//	public void Addproduct() {
//		System.out.println("Enter product id ");
//		int pro_id=sc.nextInt();
//		System.out.println("enter product name");
//		String pro_name=sc.next();
//		System.out.println("");
//		Category cat=new CategoryImpl(cat_id,cat_name);
//		
//		try {
//			cp.addCategory(cat);
//			
//			System.out.println("category aadded successfully  " );
//		} catch (SomeThingWentWrongException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
