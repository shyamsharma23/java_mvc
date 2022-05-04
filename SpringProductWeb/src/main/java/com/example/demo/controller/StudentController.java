package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;
import com.example.demo.model.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	StudentRepository studentrep; //its is going to search for StudentRep
	
	@RequestMapping("/DisplayForm")
	public ModelAndView getForm()
	{
		return new ModelAndView("StudentForm","studentobj",new Student());
	}
	@RequestMapping("/addStudent")
	public String studentData(@ModelAttribute("studentobj") Student s1)
	{
		System.out.println("Student name is "+s1.getName());
		System.out.println("Student score is "+s1.getScore());
		studentrep.save(s1);
		
		return "success";
	}

}
