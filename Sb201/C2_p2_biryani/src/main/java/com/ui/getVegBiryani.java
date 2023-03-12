package com.ui;

import com.dao.BiryaniDao;
import com.dao.BiryaniDaoImpl;
import com.exception.BiryaniException;

public class getVegBiryani {
public static void main(String[] args) {
	BiryaniDao biryaniDao=new BiryaniDaoImpl();
	
	try {
		System.out.println(biryaniDao.getVegBiryani(3));
	} catch (BiryaniException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
