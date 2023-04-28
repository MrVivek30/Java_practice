package com.dto;

import java.time.LocalDateTime;
import java.time.Month;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;
@Entity
public class PaySlip {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paySliptId;
	@Enumerated(EnumType.STRING)
	private Month month;
	private int salary;
	private LocalDateTime createdAt;
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "employeeId")
	private Employee employee;
	public PaySlip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaySlip(int paySliptId, Month month, int salary, LocalDateTime createdAt, Employee employee) {
		super();
		this.paySliptId = paySliptId;
		this.month = month;
		this.salary = salary;
		this.createdAt = createdAt;
		this.employee = employee;
	}
	public int getPaySliptId() {
		return paySliptId;
	}
	public void setPaySliptId(int paySliptId) {
		this.paySliptId = paySliptId;
	}
	public Month getMonth() {
		return month;
	}
	public void setMonth(Month month) {
		this.month = month;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "PaySlip [paySliptId=" + paySliptId + ", month=" + month + ", salary=" + salary + ", createdAt="
				+ createdAt + ", employee=" + employee + "]";
	}
	

}
