package com.ui;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.dto.Employee;
import com.dto.PaySlip;
import com.exception.EmployeeException;

public class createEmployee {
public static void main(String[] args) {
	EmployeeDao employeeDao=new EmployeeDaoImpl();
	PaySlip paySlip=new PaySlip();
//	paySlip.setPaySliptId(0);
//	paySlip.setMonth(APRIL);
	try {
		
	System.out.println(	employeeDao.createEmployee(new Employee("kamlesh",23,"kamlws@hamifl.com","5659595995")));
	} catch (EmployeeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
