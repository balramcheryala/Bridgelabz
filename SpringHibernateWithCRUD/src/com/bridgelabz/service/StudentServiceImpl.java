package com.bridgelabz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bridgelabz.dao.StudentDao;
import com.bridgelabz.model.Student;

@Service("studentService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}
	
	public List<Student> listStudents() {
		return studentDao.listStudents();
	}

	public Student getStudent(int id) {
		return studentDao.getStudent(id);
	}
	
	public void deleteStudent(Student student) {
		studentDao.deleteStudent(student);
	}

}
