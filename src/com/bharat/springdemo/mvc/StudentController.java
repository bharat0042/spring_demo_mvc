package com.bharat.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	
	@RequestMapping("/showStudentFormRequestMapping")
	public String showStudentForm(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "studentFormPage";
	}
	
	@RequestMapping("/processStudentFormRequestMapping")
	public String processStudentForm(@ModelAttribute("student")Student student, Model model) {
		
		return "studentFormConfirmationPage";
	}
}
