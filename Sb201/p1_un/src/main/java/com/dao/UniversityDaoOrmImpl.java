package com.dao;

import javax.persistence.EntityManager;

import com.dto.Student;

public class UniversityDaoOrmImpl implements UniversityDao{

	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		
		EntityManager entityManager=EmUtil.getConnection();
		entityManager.getTransaction().begin();
		Student student=entityManager.find(Student.class, id);
		if(student==null) {
			System.out.println("Data is null");
		}
		entityManager.getTransaction().commit();
		entityManager.close();
		return student;
	}

	public String saveStudent(Student student) {
		// TODO Auto-generated method stub
		String msg="not saved";
		EntityManager entityManager=EmUtil.getConnection();
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		msg="saved successfully";
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return msg;
	}

	public String deleteStudentById(int id) {
		// TODO Auto-generated method stub
		
		String msg="deleted successfully";
		EntityManager entityManager=EmUtil.getConnection();
		entityManager.getTransaction().begin();
		Student student=entityManager.find(Student.class, id);
		if (student==null) {
			msg="not deleted";
		}
		entityManager.remove(student);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return msg;
	}

	public String updateStudentCGPA(int id, int cgpa) {
		// TODO Auto-generated method stub
		String msg="updated successfully";
		EntityManager entityManager=EmUtil.getConnection();
		entityManager.getTransaction().begin();
		Student student=entityManager.find(Student.class, id);
		if (student==null) {
			msg="not updated";
		}
		student.setCgpa(cgpa);
		entityManager.getTransaction().commit();
		entityManager.close();
		return msg;
	}

}
