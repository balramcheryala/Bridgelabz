package com.bridgelabz.controllers;

import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.form.Registration;
import com.bridgelabz.model.Users;
import com.bridgelabz.service.LoginService;

@Controller
@RequestMapping("/registrationform.html")

public class RegistrationController {
	
	@Autowired
	private RegistrationValidation registrationValidation;
	
	@Autowired
	public LoginService loginService;
	public void setRegistrationValidation(RegistrationValidation registrationValidation) 
	{
		this.registrationValidation = registrationValidation;
	}
	
	@Autowired
	private LoginService employeeService;
	@RequestMapping(method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("registration") @Valid Registration registration, 
			BindingResult result,Map model) {
		// set custom Validation for Email
				registrationValidation.validate(registration, result);
				if (result.hasErrors()) 
				{
					return "registrationform";
				}
				boolean userEmailExists = loginService.checkEmail(registration.getEmail());
				System.out.println("Email Existing or Not Executing");
				if(userEmailExists)
				{
					result.rejectValue("email","invalidemail");
				return "registrationform";
				}
				boolean userNameExists = loginService.checkuserName(registration.getUserName());
				System.out.println("UserName Existing or Not Boolean method Executing");
				if(userNameExists)
				{
					result.rejectValue("userName","invalidname");
					return "registrationform";
					
				}
				else
				{
					Users user = prepareModel(registration);
					employeeService.addEmployee(user);
				return "registrationsuccess";
				}
	}
		
	// Display the form on the get request
	@RequestMapping(method = RequestMethod.GET)
	public String showRegistration(Map model) {
		Registration registration = new Registration();
		model.put("registration", registration);
		return "registrationform";
	}
	private Users prepareModel(Registration registration){
		Users user = new Users();
		user.setUserName(registration.getUserName());
		user.setUserPassword(registration.getPassword());
		user.setConfirmPassword(registration.getConfirmPassword());
		user.setEmail(registration.getEmail());
		user.setId(null);
		return user;
	}
}
