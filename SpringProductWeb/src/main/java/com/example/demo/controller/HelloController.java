package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;
/**/
@Controller
public class HelloController {
	//if request is coming for home it will be handled by this method
//http://localhost:8080/home
	@RequestMapping("/home")
	public String getHome()
	{
		System.out.println("Coming here");
		return "Welcome";//it will search for jsp page with Welcome.jsp in webapp folder
	}
	
	@RequestMapping("/info")
	public String getInfo() {
		
		System.out.println("Information");
		return "Information";
	}
	
	@RequestMapping("/data")
	public ModelAndView getData() {
		
		String message = "Welcome to spring MVC";
		return new ModelAndView("Data", "mes", message);
		
	}
	
	@RequestMapping("/studentdata")
	public ModelAndView getstudent() {
		Student st = new Student();
		st.setName("John");
		st.setScore(90);
		st.setStudent_id(1);
		
		return new ModelAndView("Data", "sinfo", st);
	}

}

/*
 * We have 3 stereotype annotation in spring mvc which can be used for differenct purposes
 * @Controller=which defines that this class is created as a controller
 * @Service=which defines this class is created as service class
 * @Repository-which defines that this class is dealing with dtabases. 
 */