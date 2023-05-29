package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmplyeeException;
import com.masai.model.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;
	
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployeeHandler(@RequestBody Employee employee) {
		Employee e=es.saveEmployee(employee);
		
		return new ResponseEntity<>(e,HttpStatus.CREATED);
	}
	
	@PutMapping("/updateEmployee")
	public ResponseEntity<Employee> updateEmployeeHandler(@RequestBody Employee employee) {
		
		Employee e=es.updateEmployee(employee);
		
		return new ResponseEntity<>(e,HttpStatus.OK);
		
	}
	@DeleteMapping("/deleteEmployee/{empId}")
	public ResponseEntity<Employee> deleteEmployeeHandler(@PathVariable Integer empId) {

		Employee e=es.deleteEmployee(empId);
		
		return new ResponseEntity<>(e,HttpStatus.OK);
		
		
	}
	
	@GetMapping("/getEmployee/{empid}")
	public ResponseEntity<Employee> getEmployeeHandler(@PathVariable Integer empid) {

		Employee e=es.getEmployee(empid);
		
		return new ResponseEntity<>(e,HttpStatus.OK);
		
	}

	@GetMapping("/getAllEmeployee")
	public ResponseEntity<List<Employee>> getAllEmployeeHandler() {

		List<Employee>list=es.getAllEmployee();
		
		return new ResponseEntity(list,HttpStatus.OK);
	}
}
