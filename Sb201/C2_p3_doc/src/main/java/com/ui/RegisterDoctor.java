package com.ui;

import java.util.ArrayList;
import java.util.List;

import com.dao.ClinicDao;
import com.dao.ClinicDaoImpl;
import com.dto.Doctor;
import com.dto.Patient;
import com.exception.DoctorNotFound;

public class RegisterDoctor {

	public static void main(String[] args) {
		
		ClinicDao clinicDao=new ClinicDaoImpl();
		
		Doctor doctor=new Doctor();
		doctor.setName("dr.Rastogi");
		doctor.setLocation("kolkata");
		doctor.setSpeciallist("haddi");

		
//		doctor.setList();
		
		Patient patient=new Patient();
		patient.setPatientName("A");

		Patient patient2=new Patient();
		patient2.setPatientName("B");
//		patient2.getDoctors().add(doctor);
		Patient patient3= new Patient();
		patient3.setPatientName("C");
//		patient.getDoctors().add(doctor);
//		patient2.getDoctors().add(doctor);
//		patient3.getDoctors().add(doctor);
//---------1st way if we initialy declarye list=new Arraylist 
		doctor.getList().add(patient);
		doctor.getList().add(patient2);
		doctor.getList().add(patient3);
		
		try {
			System.out.println(clinicDao.addDoctor(doctor));
			System.out.println(doctor.getList());
		} catch (DoctorNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		// 2nd way-----------------
//		List<Patient>patients=new ArrayList<>();
//		patients.add(patient);
//		doctor.setList(patients);
		
//		patient.getDoctors().add(doctor);
//		clinicDao
	}
}
