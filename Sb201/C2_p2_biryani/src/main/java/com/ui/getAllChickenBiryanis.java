package com.ui;

import com.dao.BiryaniDao;
import com.dao.BiryaniDaoImpl;
import com.exception.BiryaniException;

public class getAllChickenBiryanis {
public static void main(String[] args) {
	BiryaniDao biryaniDao=new BiryaniDaoImpl();
	try {
		biryaniDao.getAllChickenBiryanis();
	} catch (BiryaniException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
