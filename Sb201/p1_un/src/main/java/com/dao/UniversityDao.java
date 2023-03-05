package com.dao;

import com.dto.Student;

public interface UniversityDao {

	Student findStudentById(int id);

	String saveStudent(Student student);

	String deleteStudentById(int id);

	String updateStudentCGPA(int id, int cgpa);

}
