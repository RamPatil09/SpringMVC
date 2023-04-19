package com.xworkx.spring.bristlecone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("bristlecone")
public class BristleconeController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		EmployeeDetails employeeDetails = new EmployeeDetails();

		model.addAttribute("employeeDetails", employeeDetails);
		return "registration-showForm";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("employeeDetails") EmployeeDetails employeeDetails) {

		System.out.println("Employee Details : " + "\n" + "First Name : " + employeeDetails.getFirstName() + "\n"
				+ "Last Name : " + employeeDetails.getLastName() + "\n" + "Contact Number : "
				+ employeeDetails.getContactNumber() + "\n" + "Blood Group : " + employeeDetails.getBloodGroup() + "\n"
				+ "Work Experience : " + employeeDetails.getWorkExperience() + "\n" + "Favroite Languages : "
				+ employeeDetails.getFavoriteLanguages());
		return "registration-processForm";
	}
}
