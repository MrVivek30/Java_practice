package com.masai.ui;

import java.util.Scanner;

import com.masai.Exception.NoRecordFoundException;
import com.masai.Exception.SomeThingWentWrongException;

public class Main {
public static void main(String[] args) {
	
	Scanner sc=new Scanner (System.in);
	
	CategoryUI cu=new CategoryUI(sc);
	
	int choice;
	do {
		System.out.println("1. Add new Category");
		System.out.println("2. View All Categories");
		System.out.println("3. Update a category");
		System.out.println("4. Delete a category");
		System.out.println("5. Search categories by Name");
		System.out.println("6. Search categories by Id");
		System.out.println("0. for Exit");
		System.out.print("Enter selection ");
		choice = sc.nextInt();
		switch(choice) {
			case 1:
				cu.addcat();
				break;
			case 2:
			try {
				cu.viewAll();
			} catch (NoRecordFoundException | SomeThingWentWrongException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
			case 3:
				cu.update();
				break;
			case 4:
				cu.delete();
				break;
			case 5:
				cu.searchbyname();
				break;
			case 6:
				cu.searchbyid();
				break;
			case 7:
				
		}
	}while(choice != 0);
	sc.close();
}
}
