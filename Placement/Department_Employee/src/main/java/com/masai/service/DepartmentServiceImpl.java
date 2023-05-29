package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Department;
import com.masai.model.Employee;
import com.masai.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	
	DepartmentRepo dr;
	@Override
	public Department addNewDepartment(Department department) {
		// TODO Auto-generated method stub
		List<Employee>employees=department.getEmployees();
		
		for(Employee e:employees) {
			e.setDepartment(department);
		}
		
		return dr.save(department);
	}

}
