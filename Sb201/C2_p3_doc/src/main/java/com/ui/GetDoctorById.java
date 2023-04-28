package com.ui;

import com.dao.ClinicDao;
import com.dao.ClinicDaoImpl;
import com.exception.DoctorNotFound;

public class GetDoctorById {
public static void main(String[] args) {
	ClinicDao clinicDao=new ClinicDaoImpl();
	
	try {
		System.out.println(clinicDao.getDoctor(7));	} catch (DoctorNotFound e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
