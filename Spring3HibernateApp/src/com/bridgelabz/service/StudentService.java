package com.bridgelabz.service;

import java.util.List;

import com.bridgelabz.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);

	public List<Student> listStudents();
	
	public Student getStudent(int stdid);
	
	public void deleteStudent(Student student);
}
