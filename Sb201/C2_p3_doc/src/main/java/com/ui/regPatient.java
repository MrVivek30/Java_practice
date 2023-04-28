package com.ui;

import com.dao.ClinicDao;
import com.dao.ClinicDaoImpl;
import com.dto.Doctor;
import com.dto.Patient;
import com.exception.DoctorNotFound;
import com.exception.PatientNotFound;

public class regPatient {
public static void main(String[] args) {
	
	Patient patient=new Patient();
	
	patient.setPatientName("Ammu");
	
	Doctor doctor=new Doctor();
	
	doctor.setName("Dr Verma");
	doctor.setLocation("basti");
	doctor.setSpeciallist("Fever");
	
	patient.getDoctors().add(doctor);
	
	ClinicDao clinicDao=new ClinicDaoImpl();
	
	try {
		System.out.println(clinicDao.regPatient(patient, 7));
	} catch (DoctorNotFound e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (PatientNotFound e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
