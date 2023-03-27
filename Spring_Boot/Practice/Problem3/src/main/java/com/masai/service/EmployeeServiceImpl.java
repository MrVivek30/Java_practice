package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dto.EmployeeDTO;
import com.masai.exceptions.EmployeeException;
import com.masai.models.Employee;
import com.masai.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
private EmployeeRepo employeeRepo;
	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		Employee employee=employeeRepo.save(emp);
		return employee;
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		// TODO Auto-generated method stub
		Optional<Employee> employee=employeeRepo.findById(empId);
		if(employee.isPresent()) {
			Employee employee2=employee.get();
			return employee2;
		}
		else {
			throw new EmployeeException();
		}
		
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		// TODO Auto-generated method stub
		List<Employee>employees=employeeRepo.findAll();
		if(employees==null) throw new EmployeeException();
		return employees;
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
		Optional<Employee> employee=employeeRepo.findById(empId);
		if(employee.isPresent()) {
			Employee employee2=employee.get();
			employeeRepo.delete(employee2);
			return employee2;
			
		}
		
		else {
			throw new EmployeeException();
		}
		
	}

	@Override
	public Employee loginEmployee(String email, String password) throws EmployeeException {
		// TODO Auto-generated method stub
		
//		Employee email2=employeeRepo.findByEmail();
//		Employee pass=employeeRepo.findByPassword();
//		if(email.equals(email2) && password.equals(pass)) {
//			return email2;
//		}
	return null;
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {
		// TODO Auto-generated method stub
		List<Employee> list=employeeRepo.getByAdress(address);
		
		return list;
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		Optional<Employee> employee=employeeRepo.findById(emp.getEmpId());
		if(employee.isPresent()) {
			//Employee existingemployee=employee.
			employeeRepo.save(emp);
		}
		else {
			throw new EmployeeException();
		}
		return emp;
	}

	@Override
	public String getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {
		// TODO Auto-generated method stub
		String getDetails=employeeRepo.getNameandAddresss(empId);
		return getDetails;
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		// TODO Auto-generated method stub
		List<EmployeeDTO>employeeDTOs=employeeRepo.getNameAddSalary();
		if(employeeDTOs==null) throw new EmployeeException();
		return employeeDTOs;
	}

}
