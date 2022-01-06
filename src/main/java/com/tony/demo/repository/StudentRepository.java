package com.tony.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tony.demo.model.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}