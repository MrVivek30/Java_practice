package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmplyeeException;
import com.masai.model.Department;
import com.masai.model.Employee;
import com.masai.repository.DepartmentRepo;
import com.masai.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	DepartmentRepo dr;
	@Autowired
	EmployeeRepo er;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Department dep=dr.findById(employee.getDepartment().getDepId()).get();
		if (dep==null) {
			dep=new Department();
		}
		dep.setDepName(employee.getDepartment().getDepName());
		
		employee.setDepartment(dep);
		
		
		return er.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee)throws EmplyeeException {
		// TODO Auto-generated method stub
		Employee em=er.findById(employee.getEmpId()).get();
		if (em==null) {
				throw new  EmplyeeException("Not found");
		}
		return er.save(employee);
	}

	@Override
	public Employee deleteEmployee(Integer empId)throws EmplyeeException {
		// TODO Auto-generated method stub
		Employee em=er.findById(empId).get();
		if (em==null) {
			throw new  EmplyeeException("Not found");
		}
		er.delete(em);
		return em;
	}

	@Override
	public Employee getEmployee(Integer empid) throws EmplyeeException{
		// TODO Auto-generated method stub
		Employee em=er.findById(empid).get();
		if (em==null) {
			throw new  EmplyeeException("Not found");
		}
		return em;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
	List<Employee>list=er.findAll()
	;
	if (list.isEmpty()) {
		return null;
	}
	return list;
		}
	
	}
