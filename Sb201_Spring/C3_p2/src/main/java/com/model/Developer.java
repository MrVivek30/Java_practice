package com.model;

import java.util.Map;

public class Developer {
	private int id;
	private String name;
	private int noofprojectdone;
	private int age;
	private String email;
	private String mobile;

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Developer(int id, String name, int noofprojectdone, int age, String email, String mobile) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.noofprojectdone = noofprojectdone;
//		this.age = age;
//		this.email = email;
//		this.mobile = mobile;
//	}

	public Developer(int id, String name, int age, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
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

	public int getNoofprojectdone() {
		return noofprojectdone;
	}

	public void setNoofprojectdone(int noofprojectdone) {
		this.noofprojectdone = noofprojectdone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", noofprojectdone=" + noofprojectdone + ", age=" + age
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}

}
