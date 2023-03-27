package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.StudentException;
import com.masai.Model.Address;
import com.masai.Model.Student;
import com.masai.Model.StudentDTO;
import com.masai.repositry.StudentDao;

@Service
public class StudentserviceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getAllStudentDetails() throws StudentException {
		List<Student> studentj =  studentDao.findAll();
		if(studentj.size()==0)throw new StudentException("No List of Student Present");
		else return studentj;
		
	}

	@Override
	public List<Student> getStudentDetailsByAddress(Address address) throws StudentException {
		List<Student> studentj = studentDao.findByAddress(address);
		if(studentj.size()==0)throw new StudentException("Student Not Found by this address ");
		else return studentj;
	}

	@Override
	public Student updateStudentEmail(Integer studentId, String oldEmail, String newEmail) throws StudentException {
		Optional<Student> studentj =studentDao.findById(studentId);
		if(studentj.isEmpty()) {
			throw new StudentException("Student Not updated ");
		}else {
			if(studentj.get().getEmail()==oldEmail) {

				studentj.get().setEmail(newEmail);
			
			}		
		return studentDao.save(studentj.get());
		}
	}

	@Override
	public Student updateStudentAddress(Integer studentId, Address address) throws StudentException {
Optional<Student> studentj = studentDao.findById(studentId);
		
		if(studentj.isEmpty()) {
			throw new StudentException("no employee found");
		}
		studentj.get().setAddress(address);
		studentDao.save(studentj.get());
		return studentj.get();
		}
	

	@Override
	public List<Student> getStudentsBetweenAge(Integer start_age, Integer end_age) throws StudentException {
		List<Student> studentj = studentDao.findStudentBetweenAge(start_age,end_age);
		if(studentj.isEmpty())throw new StudentException("no employee found");
		return studentj;
	}

	@Override
	public List<StudentDTO> getNameAddressAgeOfAllStudents() throws StudentException {
		List<StudentDTO> studentj = studentDao.findnameAddressAgeOfAllStudents();
		if(studentj.isEmpty())throw new StudentException("no employee found");
		return studentj;
	}

}
