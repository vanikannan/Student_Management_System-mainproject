package com.SpringBootProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootProject.entity.Student;

//JPA repository has two entity <type,id>
public interface StudentRepository  extends JpaRepository<Student, Long>{

} 


