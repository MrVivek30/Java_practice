package com.ui;

import java.util.Iterator;
import java.util.List;

import com.dao.CabDao;
import com.dao.CabDaoImpl;
import com.dto.CabOwner;
import com.exception.CabOwnerNotFoundException;

public class GetAllowner {
	public static void main(String[] args) {
		
	
CabDao cabDao=new CabDaoImpl();
try {
	List<CabOwner>cabOwners=cabDao.getCabOwners();
	
	for (Iterator iterator = cabOwners.iterator(); iterator.hasNext();) {
		CabOwner cabOwner = (CabOwner) iterator.next();
		System.out.println(cabOwner);
	}
} catch (CabOwnerNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
}
