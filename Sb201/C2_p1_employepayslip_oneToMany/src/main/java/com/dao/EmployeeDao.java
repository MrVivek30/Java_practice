package com.dao;

import java.util.List;

import com.dto.Employee;
import com.dto.Month;
import com.dto.PaySlip;
import com.exception.EmployeeException;
import com.exception.PaySlipNotFoundException;

public interface EmployeeDao {
public Employee createEmployee(Employee employee) throws EmployeeException;
public String createPaySlip(PaySlip paySlip,int EmployeeId) throws EmployeeException,PaySlipNotFoundException;
public PaySlip getPaySlipByMonth(Month months) throws PaySlipNotFoundException;
public PaySlip getPaySlipById(int paySlipId) throws PaySlipNotFoundException;
public void createEmployeePaySlips(List<PaySlip>paySlips,int employeeId )throws EmployeeException;

}
