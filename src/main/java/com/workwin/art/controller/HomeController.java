package com.workwin.art.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
		
	@GetMapping("/user")
	public String user() {
		return "This is user page";		
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "This is admin page";		
	}

}
