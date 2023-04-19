package com.xworkz.spring.groceryStore;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GroceryListController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "grocery-showlist";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "grocery-processForm";
	}

	@RequestMapping("/processFormTwo")
	public String letsCallCustomer(HttpServletRequest request, Model model) {
		String name = request.getParameter("customerName");
		name = name.toUpperCase();
		String message = "Hey! " + name;
		model.addAttribute("message", message);
		String message1 = "Here is your Items...";
		model.addAttribute("message1", message1);
		return "grocery-processForm";
	}

	@RequestMapping("/processFormThree")
	public String letsGetCustomerList(@RequestParam("customerName") String name, Model model) {
		name = name.toUpperCase();
		String message = "Hey! " + name;
		model.addAttribute("message", message);
		String message1 = "Here is your Items...";
		model.addAttribute("message1", message1);
		return "grocery-processForm";
	}
}
