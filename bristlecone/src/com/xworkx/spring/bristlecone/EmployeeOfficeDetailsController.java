package com.xworkx.spring.bristlecone;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")

public class EmployeeOfficeDetailsController {

	@RequestMapping("/showForm")
	public String shoeForm(Model model) {
		model.addAttribute("employeeOfficeDetails", new EmployeeOfficeDetails());
		return "employee-office-details";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("employeeOfficeDetails") EmployeeOfficeDetails details,
			BindingResult bindingResult) {
		System.out.println("The binding details : " + bindingResult);
		System.out.println("\n\n\n\n");
		if (bindingResult.hasErrors()) {
			return "employee-office-details";
		} else {
			return "employee-office-details-confirmation";
		}
	}
}
