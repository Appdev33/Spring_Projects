package com.nr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nr.entity.Student;
import com.nr.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		System.out.println("hello");
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1 = new Student("Nitesh","Singh","nit@gmail.com");
//		Student student2 = new Student("karan","Sngh","abc@gmail.com");
//		Student student3 = new Student("paall","gh","xyz@gmail.com");
//		
//		studentRepository.save(student1);
//		studentRepository.save(student2);
//		studentRepository.save(student3);
		
	}

}
