package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // Parent mapping
public class HelloWorldController {

	//need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm") // submapping
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
	
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// convert the data to all upper case
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	// new controller method to read form data and
	// add data to the model
	@RequestMapping("/processFormVersionThree") // read the request parameter from the HTML form
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		// convert the data to all upper case
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Hey My Friend from v3 - " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
