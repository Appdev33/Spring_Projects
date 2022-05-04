package com.nr.service;

import java.util.List;

import com.nr.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	Student getStudentId(Long id);
	Student updateStudent(Student student);
	void deleteStudent(Long id);
}
