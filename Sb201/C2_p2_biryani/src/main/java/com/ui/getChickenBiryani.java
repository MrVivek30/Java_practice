package com.ui;

import com.dao.BiryaniDao;
import com.dao.BiryaniDaoImpl;
import com.exception.BiryaniException;

public class getChickenBiryani {
public static void main(String[] args) {
	BiryaniDao biryaniDao=new BiryaniDaoImpl();
	
	try {
		System.out.println(biryaniDao.getChickenBiryani(1));
	} catch (BiryaniException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
