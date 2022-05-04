package com.nr.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nr.entity.Student;
import com.nr.service.StudentService;
import com.nr.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository StudentRepository;
	
	public StudentServiceImpl(com.nr.repository.StudentRepository studentRepository) {
		super();
		StudentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return StudentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return StudentRepository.save(student);
	}

	@Override
	public Student getStudentId(Long id) {
		return StudentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return StudentRepository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		StudentRepository.deleteById(id);
	}
		
}
