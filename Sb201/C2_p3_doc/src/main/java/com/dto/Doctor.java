package com.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int doctorId;
	private String name;
	private String speciallist;
	private String location;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "Doctor_Patient",joinColumns = 
	{@JoinColumn(name="doctorId")},inverseJoinColumns = {@JoinColumn(name="patientId")})
	private List<Patient> patients = new ArrayList<>();

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int doctorId, String name, String speciallist, String location, List<Patient> list) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.speciallist = speciallist;
		this.location = location;
		this.patients = list;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciallist() {
		return speciallist;
	}

	public void setSpeciallist(String speciallist) {
		this.speciallist = speciallist;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Patient> getList() {
		return patients;
	}

	public void setList(List<Patient> list) {
		this.patients = list;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", name=" + name + ", speciallist=" + speciallist + ", location="
				+ location +  "]";
	}

	

}
