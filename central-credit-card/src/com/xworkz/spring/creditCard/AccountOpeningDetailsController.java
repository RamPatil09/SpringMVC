package com.xworkz.spring.creditCard;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("accountOpeningDetails")
public class AccountOpeningDetailsController {
	@InitBinder
	public void initBuilder(DataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("accountOpeningDetails", new AccountOpeningDetails());
		return "account-opening-show";
	}

	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("accountOpeningDetails") AccountOpeningDetails accountOpeningDetails,
			BindingResult bindingResult) {
		System.out.println("The binding result is : " + bindingResult);
		System.out.println("\n\n\n\n");
		if (bindingResult.hasErrors()) {
			return "account-opening-show";
		} else {
			return "account-opening-process";
		}
	}
}
