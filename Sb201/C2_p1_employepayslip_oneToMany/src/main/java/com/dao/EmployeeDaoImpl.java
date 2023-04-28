package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dto.Employee;
import com.dto.Month;
import com.dto.PaySlip;
import com.exception.EmployeeException;
import com.exception.PaySlipNotFoundException;
//import com.mysql.cj.Query;

public class EmployeeDaoImpl implements EmployeeDao{

	EntityManager em=EmUtil.getCon();
	public Employee createEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
//	Employee employee2=em.find(Employee.class, employee);
//		Employee employee2=
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		return employee;
	}

	public String createPaySlip(PaySlip paySlip, int EmployeeId) throws EmployeeException, PaySlipNotFoundException {
		// TODO Auto-generated method stub
//		String msgString="failed";
		Employee employee=em.find(Employee.class, EmployeeId);
		em.getTransaction().begin();
		employee.getPaySlips().add(paySlip);
		if(employee!=null) {
//			PaySlip paySlip2=
			
			em.persist(paySlip);
		}
		em.getTransaction().commit();
		em.close();
		return "succesffully";
	}

	public PaySlip getPaySlipByMonth(Month months) throws PaySlipNotFoundException {
		// TODO Auto-generated method stub
		Query query=em.createQuery("from PaySlip p where p.month=?");
		
		query.setParameter(1, months);
		
		PaySlip paySlip=(PaySlip) query.getSingleResult();
		
	
		return paySlip;
	}

	public PaySlip getPaySlipById(int paySlipId) throws PaySlipNotFoundException {
		// TODO Auto-generated method stub
		
		PaySlip paySlip =em.find(PaySlip.class, paySlipId);
		
		
		return paySlip;
	}

	public void createEmployeePaySlips(List<PaySlip> paySlips, int employeeId) throws EmployeeException {
		// TODO Auto-generated method stub
		
		
	}

}
