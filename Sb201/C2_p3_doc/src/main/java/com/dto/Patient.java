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
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	private String patientName;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "patients")

	List<Doctor> doctors = new ArrayList<>();

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int patientId, String patientName, List<Doctor> doctors) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.doctors = doctors;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", doctors=" + doctors + "]";
	}

	

}
