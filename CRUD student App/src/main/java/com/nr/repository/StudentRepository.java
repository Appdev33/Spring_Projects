package com.nr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nr.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
