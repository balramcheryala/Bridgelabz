package com.bridgelabz.dao;

import java.util.List;

import com.bridgelabz.model.Student;


public interface StudentDao {
	
	public void addStudent(Student student);

	public List<Student> listStudents();
	
	public Student getStudent(int id);
	
	public void deleteStudent(Student student);
}
