package com.springboot.thymeleaf.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	//handler for VARIABLE
	@RequestMapping(value="/about",method= RequestMethod.GET)
	public String about(Model model) {
		
		System.out.println("Inside the handler....");
		
		model.addAttribute("name", "Karana");
		
		model.addAttribute("currentDate", new Date().toLocaleString());
		
		return "about";
	}
	
	//HANDLER FOR LOOPING STATEMENT
	@GetMapping("/looop")
	public String handlingItration(Model model) {
		List<String> names = List.of("Karana","Krish","Bhema","Arjuna");
		model.addAttribute("names",names);
		return "itrate";
	}
	
	//HANDLER FOR CONDITIONAL STATEMENT
	@GetMapping("/condition")
	public String condtionHandler(Model model) {
		System.out.println("Condtion handler...............");
		//Elvis operator
		model.addAttribute("isActive", false);
		//IF-unless
		model.addAttribute("gender", "M");
		//switch case
		List<Integer> list = List.of(1,2,3);
		model.addAttribute("mylist", list);
		return "condition";
	}
	
	//handler Fragment
	@GetMapping("/services")
	public String fragmentHandler(Model model) {
		
		model.addAttribute("title", "My Name Is Main Titel");
		model.addAttribute("subtitle", LocalDateTime.now().toString());
		
		return "services";
	}
	
	@GetMapping("/newAbout")
	public String newAbout(Model model) {
		model.addAttribute("title", "My Name Is Main Titel");
		model.addAttribute("subtitle", LocalDateTime.now().toString());
		return "newAbout";
	}
	
	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("title", "My Name Is Contact Titel");
		model.addAttribute("subtitle", LocalDateTime.now().toString());
		return "contact";
	}
	
	
	

}
