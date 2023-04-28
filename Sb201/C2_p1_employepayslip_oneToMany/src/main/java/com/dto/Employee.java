package com.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	private String nameString;
	private int age;
	private String emailString;
	private String phoneString;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "employee")
	
	private List<PaySlip> paySlips;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(String nameString, int age, String emailString, String phoneString) {
		super();
		this.nameString = nameString;
		this.age = age;
		this.emailString = emailString;
		this.phoneString = phoneString;
	}

	public Employee(int employeeId, String nameString, int age, String emailString, String phoneString,
			List<PaySlip> paySlips) {
		super();
		this.employeeId = employeeId;
		this.nameString = nameString;
		this.age = age;
		this.emailString = emailString;
		this.phoneString = phoneString;
		this.paySlips = paySlips;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	public String getPhoneString() {
		return phoneString;
	}
	public void setPhoneString(String phoneString) {
		this.phoneString = phoneString;
	}
	public List<PaySlip> getPaySlips() {
		return paySlips;
	}
	public void setPaySlips(List<PaySlip> paySlips) {
		this.paySlips = paySlips;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", nameString=" + nameString + ", age=" + age + ", emailString="
				+ emailString + ", phoneString=" + phoneString + "]";
	}
	
	
	
}
