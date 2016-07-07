package com.bridgelabz.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Map;
import javax.validation.Valid;
import com.bridgelabz.form.LoginForm;
import com.bridgelabz.service.*;

//Allowing for implementation classes to be autodetected through classpath scanning.
//It is typically used in combination with annotated handler methods based on the RequestMapping annotation.
@Controller
@RequestMapping("loginform.html")
public class LoginController {

	//Marks a constructor, field, setter method or config method.
	//as to be autowired by Spring's dependency injection facilities. 
	@Autowired
	public LoginService loginService;

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Map<String, LoginForm> model) {
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		return "loginform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processForm(@Valid LoginForm loginForm, BindingResult result,
			Map<String, LoginForm> model) {

		
		if (result.hasErrors()) {
			return "loginform";
		}
		//checking username and password is correct or not
		boolean userExists = loginService.checkLogin(loginForm.getUserName(),loginForm.getPassword());
		if(userExists){
			model.put("loginForm", loginForm);
			return "loginsuccess";
		}else{
			result.rejectValue("userName","invaliduser");
			return "loginform";
		}
	}

}