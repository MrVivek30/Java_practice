package com.dao;

import com.dto.ChickenBiryani;
import com.exception.BiryaniException;

public class insertChickenBiryani {
public static void main(String[] args) {
	BiryaniDao biryaniDao=new BiryaniDaoImpl();
	
	try {
		System.out.println(biryaniDao.insertChickenBiryani(new ChickenBiryani(1,50,"farzi")));
	} catch (BiryaniException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
