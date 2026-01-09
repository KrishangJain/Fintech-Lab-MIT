package com.example.myproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyprojectApplication {
	@GetMapping("/")
	public String index() {
		return "Greetings from MIT-FIS!";
	}
}