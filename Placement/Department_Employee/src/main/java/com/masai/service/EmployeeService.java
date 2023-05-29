package com.masai.service;

import java.util.List;

import com.masai.exception.EmplyeeException;
import com.masai.model.Employee;

public interface EmployeeService {

	
	public Employee saveEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee)throws EmplyeeException;
	
	public Employee deleteEmployee(Integer empId)throws EmplyeeException;
	
	public Employee getEmployee(Integer empid)throws EmplyeeException;

	public List<Employee> getAllEmployee();
}
