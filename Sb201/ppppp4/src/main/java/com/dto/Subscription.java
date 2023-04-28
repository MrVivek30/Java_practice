package com.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscription {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String address;
	private String plan_name;
	private int price;
	private LocalDate start_date;
	private LocalDate end_date;
	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subscription(int id, String name, String email, String address, String plan_name, int price,
			LocalDate start_date, LocalDate end_date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.plan_name = plan_name;
		this.price = price;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	@Override
	public String toString() {
		return "Subscription [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", plan_name=" + plan_name + ", price=" + price + ", start_date=" + start_date + ", end_date="
				+ end_date + "]";
	}
	
	
	
}
