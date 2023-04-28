package com.dao;

import javax.persistence.EntityManager;

import com.dto.Doctor;
import com.dto.Patient;
import com.exception.DoctorNotFound;
import com.exception.PatientNotFound;

public class ClinicDaoImpl implements ClinicDao {

	@Override
	public Doctor addDoctor(Doctor doctor) throws DoctorNotFound {
		// TODO Auto-generated method stub
		
		EntityManager eManager=EmUtil.getCon();
		eManager.getTransaction().begin();
		
		
		eManager.persist(doctor);
		
		eManager.getTransaction().commit();
		eManager.close();
		return doctor;
	}

	@Override
	public Doctor getDoctor(int id) throws DoctorNotFound {
		EntityManager eManager=EmUtil.getCon();
		eManager.getTransaction().begin();
		
		Doctor doctor=eManager.find(Doctor.class, id);
		
		eManager.getTransaction().commit();
		eManager.close();
		return doctor;
	}

	@Override
	public Patient regPatient(Patient patient, int id) throws DoctorNotFound, PatientNotFound {
		EntityManager eManager=EmUtil.getCon();
		eManager.getTransaction().begin();
		
		Doctor doctor=eManager.find(Doctor.class, id);
		if (doctor==null) {
			throw new DoctorNotFound();
		}
		eManager.persist(patient);
		
		eManager.getTransaction().commit();
		eManager.close();
		return patient;
	}

	@Override
	public Patient getPatient(int patientId) throws PatientNotFound {
		EntityManager eManager=EmUtil.getCon();
		eManager.getTransaction().begin();
		
		Patient patient=eManager.find(Patient.class, patientId);
		
//		eManager.persist(patient);
		
		eManager.getTransaction().commit();
		eManager.close();
		return patient;
	}

	@Override
	public void registerPatientWithDiffDoctor(int patientId, int doctorId) throws DoctorNotFound, PatientNotFound {
		EntityManager eManager=EmUtil.getCon();
		eManager.getTransaction().begin();
		

		Patient patient=eManager.find(Patient.class, patientId);
		Doctor doctor=eManager.find(Doctor.class, doctorId);
		
		if (patient==null) {
			throw new PatientNotFound();
		}
		if (doctor==null) {
			throw new DoctorNotFound();
		}
		
		eManager.persist(doctor);
		eManager.persist(patient);
		
		eManager.getTransaction().commit();
		eManager.close();
		
	}

}
