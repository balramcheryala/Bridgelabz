package com.bridgelabz.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.bean.StudentBean;
import com.bridgelabz.model.Student;
import com.bridgelabz.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute("command") StudentBean studentBean, 
			BindingResult result) {
		System.out.println("Save Student Block Entered");
		Student student = prepareModel(studentBean);
		System.out.println("Model Student Created");
		studentService.addStudent(student);
		System.out.println("Next add.html redicting");
		return new ModelAndView("regsuc");
	}
	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public ModelAndView editStudent1(@ModelAttribute("command") StudentBean studentBean, 
			BindingResult result) {
		System.out.println("Save Student Block Entered");
		Student student = prepareModel(studentBean);
		System.out.println("Model Student Created");
		studentService.addStudent(student);
		System.out.println("Next add.html redicting");
		return new ModelAndView("editsuc");
	}
	@RequestMapping(value="/students", method = RequestMethod.GET)
	public ModelAndView listStudents() {
		System.out.println("/Students controller Block Entered");
		Map<String, Object> model = new HashMap<String, Object>();
		System.out.println("Map key value with object of model created");
		model.put("students",  prepareListofBean(studentService.listStudents()));
		System.out.println("printing Student List");
		return new ModelAndView("studentList", model);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.GET)
	public ModelAndView updateStudents() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("students",  prepareListofBean(studentService.listStudents()));
		return new ModelAndView("update", model);
	}
	@RequestMapping(value="/deleteop", method = RequestMethod.GET)
	public ModelAndView delete() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("students",  prepareListofBean(studentService.listStudents()));
		return new ModelAndView("delete", model);
	}
		
		@RequestMapping(value = "/add", method = RequestMethod.GET)
		public ModelAndView addStudent(@ModelAttribute("command")  StudentBean studentBean,
			BindingResult result) {
			System.out.println("ADD Student Block Entered");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("students",  prepareListofBean(studentService.listStudents()));
		System.out.println("put values in model and redirecting to add student page");
		return new ModelAndView("addStudent", model);
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		System.out.println("Index Page opened");
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView editStudent(@ModelAttribute("command")  StudentBean studentBean,
			BindingResult result) {
		System.out.println("delete url executing in controller");
		studentService.deleteStudent(prepareModel(studentBean));
		System.out.println("studentService.deleteStudent calling");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("student", null);
		model.put("students",  prepareListofBean(studentService.listStudents()));
		/*return new ModelAndView("addStudent", model);*/
		return new ModelAndView("delsuc",model);
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView deleteStudent(@ModelAttribute("command")  StudentBean studentBean,
			BindingResult result) {
		System.out.println("/edit");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("student", prepareStudentBean(studentService.getStudent(studentBean.getId())));
		model.put("students",  prepareListofBean(studentService.listStudents()));
		return new ModelAndView("editstudent", model);
	}
	
	private Student prepareModel(StudentBean studentBean){
		System.out.println("preparing model for Student");
		Student student = new Student();
		student.setId(studentBean.getId());
		student.setFname(studentBean.getFname());
		student.setLname(studentBean.getLname());
		student.setRnumber(studentBean.getRnumber());
		student.setMobile(studentBean.getMobile());
		student.setAddress(studentBean.getAddress());
		studentBean.setId(null);
		return student;
	}
	
	private List<StudentBean> prepareListofBean(List<Student> students){
		List<StudentBean> beans = null;
		System.out.println("Preparing list of beans for Student Bean");
		if(students != null && !students.isEmpty()){
			beans = new ArrayList<StudentBean>();
			StudentBean bean = null;
			for(Student student : students){
				bean = new StudentBean();
				bean.setId(student.getId());
				bean.setFname(student.getFname());
				bean.setLname(student.getLname());
				bean.setRnumber(student.getRnumber());
				bean.setMobile(student.getMobile());
				bean.setAddress(student.getAddress());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private StudentBean prepareStudentBean(Student student){
		System.out.println("Student Bean Preparing by PrepareStudentBean ");
		StudentBean bean = new StudentBean();
		bean.setId(student.getId());
		bean.setFname(student.getFname());
		bean.setLname(student.getLname());
		bean.setRnumber(student.getRnumber());
		bean.setMobile(student.getMobile());
		bean.setAddress(student.getAddress());
		return bean;
	}
}
