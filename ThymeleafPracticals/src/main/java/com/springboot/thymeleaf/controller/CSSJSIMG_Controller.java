package com.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CSSJSIMG_Controller {

	@GetMapping("/example")
	public String fileHandler() {
		
		return "example";
	}
}
