package com.dao;

import com.dto.Doctor;
import com.dto.Patient;
import com.exception.DoctorNotFound;
import com.exception.PatientNotFound;

public interface ClinicDao {
public Doctor addDoctor(Doctor doctor) throws DoctorNotFound;
public Doctor getDoctor(int id) throws DoctorNotFound;
public Patient regPatient(Patient patient,int id) throws DoctorNotFound,PatientNotFound;
public Patient getPatient(int patientId) throws PatientNotFound;
public void registerPatientWithDiffDoctor(int patientId,int doctorId) throws DoctorNotFound,PatientNotFound;

}
