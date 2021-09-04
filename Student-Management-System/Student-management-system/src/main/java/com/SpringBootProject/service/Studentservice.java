package com.SpringBootProject.service;

import java.util.List;

import com.SpringBootProject.entity.Student;

public interface Studentservice {

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	
  void deleteStudentById(Long id);
}


