package com.xworkz.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		// create object for student
		Student student = new Student();

		// add student object to model
		model.addAttribute("student", student);

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {

		// log the input data
		System.out.println("The Student : " + student.getFirstName() + " " + student.getLastName() + "\n"
				+ student.getAge() + "\n" + student.getBloodGroup() + "\n" + student.getEmail() + "\n"
				+ student.getPhoneNumber() + "\n" + student.getCountry() + "\n" + student.getFavoriteLanguage() + "\n"
				+ "Favorite Operating Systems : " + student.getFavroiteOS());

		return "student-confirmation";
	}
}
