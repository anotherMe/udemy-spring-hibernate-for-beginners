package com.luv2code.springdemo.mvc;

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
	
	@RequestMapping("/processFormV2")
	public String processFormVersion2(HttpServletRequest request, Model model) {
		
		String studentName = request.getParameter("studentName");
		studentName = studentName.toUpperCase();
		model.addAttribute("uppercaseStudentName", studentName);
		return "helloworld";
	}

	@RequestMapping("/processFormV3")
	public String processFormVersion3(@RequestParam("studentName") String studentName, Model model) {

		studentName = studentName.toUpperCase();
		model.addAttribute("uppercaseStudentName", studentName);
		return "helloworld";
	}
}
