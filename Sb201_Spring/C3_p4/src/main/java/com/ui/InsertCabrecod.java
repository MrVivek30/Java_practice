package com.ui;

import com.dao.CabDao;
import com.dao.CabDaoImpl;
import com.dto.Cab;
import com.dto.CabOwner;
import com.exception.CabOwnerNotFoundException;

public class InsertCabrecod {
public static void main(String[] args) {
	
	
	
	CabDao cabDao=new CabDaoImpl();
	
	CabOwner cabOwner1=new CabOwner();
	cabOwner1.setOwnerName("vivek");
	cabOwner1.setPhoneNumber("6565656");
	cabOwner1.setEmailId("@gmil.com");
	
	Cab cab1=new Cab(1,"black","wagnor");
	cabOwner1.setCab(cab1);
	
	
	CabOwner cabOwner2=new CabOwner();
	cabOwner2.setOwnerName("raj");
	cabOwner2.setPhoneNumber("699565656");
	cabOwner2.setEmailId("raj@gmil.com");
	
	Cab cab2=new Cab(2,"white","swift");
	cabOwner2.setCab(cab2);
	
	
	CabOwner cabOwner3=new CabOwner();
	cabOwner3.setOwnerName("sanju");
	cabOwner3.setPhoneNumber("9995656");
	cabOwner3.setEmailId("sanju@gmil.com");
	
	Cab cab3=new Cab(3,"blue","hondie");
	cabOwner3.setCab(cab3);
	
	
	CabOwner cabOwner4=new CabOwner();
	cabOwner4.setOwnerName("golu");
	cabOwner4.setPhoneNumber("888424");
	cabOwner4.setEmailId("golu@gmil.com");
	
	Cab cab4=new Cab(4,"yellow","wagnor");
	cabOwner4.setCab(cab4);
	
	CabOwner cabOwner5=new CabOwner();
	cabOwner5.setOwnerName("shilu");
	cabOwner5.setPhoneNumber("7775656");
	cabOwner5.setEmailId("shilu@gmil.com");
	
	Cab cab5=new Cab(5,"red","alto");
	cabOwner5.setCab(cab5);
	
	try {
		System.out.println(cabDao.createCabOwner(cabOwner1));;
		cabDao.createCabOwner(cabOwner2);
		cabDao.createCabOwner(cabOwner3);
		cabDao.createCabOwner(cabOwner4);
		cabDao.createCabOwner(cabOwner5);
		
	} catch (CabOwnerNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
