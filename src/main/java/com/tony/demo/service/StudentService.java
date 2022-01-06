package com.tony.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.tony.demo.model.Student;



public interface StudentService {
	List<Student> getAllStudents();
	void saveStudent(Student student);
	Student getStudentById(long id);
	void deleteStudentById(long id);
	Page<Student> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}