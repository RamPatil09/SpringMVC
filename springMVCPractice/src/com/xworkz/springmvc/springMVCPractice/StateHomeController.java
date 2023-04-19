package com.xworkz.springmvc.springMVCPractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StateHomeController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "stateForm";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "stateDetails";
	}
}
