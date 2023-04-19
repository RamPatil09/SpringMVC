package com.xworkz.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// new a controller method to read data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from HTML page
		String name = request.getParameter("studentName");

		// convert to Upper case
		name = name.toUpperCase();

		// create the message
		String result = "Hey! " + name;

		// add message to theModel
		model.addAttribute("message", result); // message attribute can be anything
		return "helloworld";
	}

	// new a controller method to read data and
	// add data to the model
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {

		// convert to Upper case
		name = name.toUpperCase();

		// create the message
		String result = "Hey! From v4 " + name;

		// add message to theModel
		model.addAttribute("message", result); // message attribute can be anything
		return "helloworld";
	}

}
