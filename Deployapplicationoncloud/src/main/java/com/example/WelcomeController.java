package com.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController {
	@GetMapping("/")
	public String welcome() {
		return "Welcome Spring Boot Application on AWS Cloud";
	}

}