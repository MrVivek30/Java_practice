package com.masai.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.dto.EmployeeDTO;
import com.masai.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
//@Query("select e.email from Employee e")
//public Employee findByEmail();
//
//public Employee findByPassword();

@Query("select e from Employee e where e.address=?1  ")
public List<Employee> getByAdress(String address);

@Query("select e.empName,e.address from Employee e where e.empId=?1")
public String getNameandAddresss(Integer empId);

@Query("select new com.masai.dto.EmployeeDTO(empName,address,salary) from Employee")
public List<EmployeeDTO> getNameAddSalary();

}
