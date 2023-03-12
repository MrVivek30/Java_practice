package com.ui;

import com.dao.BiryaniDao;
import com.dao.BiryaniDaoImpl;
import com.exception.BiryaniException;

public class getAllchickenBiryani {
public static void main(String[] args) throws BiryaniException {
	BiryaniDao biryaniDao=new BiryaniDaoImpl();
	
	System.out.println(biryaniDao.getAllChickenBiryanis());
}
	
	
 
}
