package com.masai.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.Model.Address;
import com.masai.Model.Student;
import com.masai.Model.StudentDTO;
@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{
	List<Student> findByAddress(Address address );
	List<Student> findStudentBetweenAge(Integer start_age, Integer end_age);
	@Query("select new com.masai.Model.StudentDto(s.studentName ,s.address,s.age)from Student s")
	List<StudentDTO> findnameAddressAgeOfAllStudents();
	Student findByEmail(Integer studentId, String oldEmail,String newEmail);
	

}
