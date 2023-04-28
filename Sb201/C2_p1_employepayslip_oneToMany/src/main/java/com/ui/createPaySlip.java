package com.ui;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.dto.Employee;
import com.dto.PaySlip;
import com.exception.EmployeeException;
import com.exception.PaySlipNotFoundException;

public class createPaySlip {
public static void main(String[] args) {
	EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	try {
		employeeDao.createPaySlip(null, 1);
	} catch (PaySlipNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
