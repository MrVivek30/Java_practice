package com.ui;

import com.dao.BiryaniDao;
import com.dao.BiryaniDaoImpl;
import com.dto.VegBiryani;
import com.exception.BiryaniException;

public class insertVegBiryani {
public static void main(String[] args) throws BiryaniException {
	BiryaniDao biryaniDao=new BiryaniDaoImpl();
	
System.out.println(biryaniDao.insertVegBiryani(new VegBiryani(3,60,"delicious")));


}}
