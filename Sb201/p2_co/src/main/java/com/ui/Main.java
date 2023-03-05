package com.ui;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.dao.CourierDao;
import com.dao.CourierDaoImpl;
import com.dto.Shipment;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	CourierDao cd=new CourierDaoImpl();
	
	int choice=0;
	
	do {
		System.out.println("1.find shipment by Id");
		System.out.println("2.create new Shipment");
		System.out.println("3.delete shipment by Id");
		System.out.println("4.update shipment by Id");
		System.out.println("0 for exit");
		System.out.println("enter choice");
		choice=sc.nextInt();
		if(choice==1) {
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println(cd.findShipmentById(id));
			
		}

		else if(choice==2) {
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter packageNumber");
			String packageNumber=sc.next();
			System.out.println("enter content");
			String content=sc.next();
			System.out.println("enter weight");
			double weight=sc.nextDouble();
			System.out.println("enter senderAddress");
			String senderAddress=sc.next();
			System.out.println("enter recipientAddress ");
			String recipientAddress=sc.next();
			
			System.out.println(cd.createNewShipment(new Shipment(id,packageNumber,content,weight,senderAddress,recipientAddress,LocalDateTime.now())));
		}
		else if(choice==3) {
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println(cd.deleteShipmentById(id));
		}
		else if(choice==4) {
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter content");
			String content=sc.next();
			System.out.println("enter weight");
			double weight=sc.nextDouble();
			System.out.println("enter recipientAddress ");
			String recipientAddress=sc.next();
			System.out.println(cd.updateShipmentById(id, content, weight, recipientAddress));
		}		
	} while (choice!=0);
	sc.close();
	}
}

