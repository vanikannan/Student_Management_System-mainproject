package com.SpringBootProject.service.Implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBootProject.entity.Student;
import com.SpringBootProject.repository.StudentRepository;
import com.SpringBootProject.service.Studentservice;

@Service
public class StudentServiceImpl implements Studentservice {
    
	

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	
	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
	
	



