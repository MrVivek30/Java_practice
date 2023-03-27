package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.dto.EmployeeDTO;
import com.masai.exceptions.EmployeeException;
import com.masai.models.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
private EmployeeService employeeService;
	@PostMapping("/registeremp")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) throws EmployeeException{
		Employee employee2=employeeService.registerEmployee(employee);
		return new ResponseEntity<Employee>(employee2,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/empbyid/{empId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer empId) throws EmployeeException{
		Employee employee=employeeService.getEmployeeById(empId);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	@GetMapping("/allemployee")
	public ResponseEntity<List<Employee>> getAllEmployee() throws EmployeeException{
		List<Employee> employees=employeeService.getAllEmployeeDetails();
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
	}
	
	@PutMapping("/updateemployee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) throws EmployeeException{
		Employee employee2=employeeService.updateEmployee(employee);
		return new ResponseEntity<Employee>(employee2,HttpStatus.OK);
	}
	
	@GetMapping("/getnameandaddress/{empId}")
	public ResponseEntity<String> getnameandaddress(@PathVariable Integer empId) throws EmployeeException{
		String s=employeeService.getNameAndAddressOfEmplyeeById(empId);
		return new ResponseEntity<String>(s,HttpStatus.OK);
		
	}
	
	@GetMapping("/getnameaddsal")
	public ResponseEntity<List<EmployeeDTO>> getnameaddsal() throws EmployeeException{
		List<EmployeeDTO> employees=employeeService.getNameAddressSalaryOfAllEmployee();
		return new ResponseEntity<List<EmployeeDTO>>(employees,HttpStatus.OK);
	}
	

}
