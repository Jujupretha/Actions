package com.example.Teamazure.Teamazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsApplication {
	@GetMapping("/")
	public String message() {
		return "GitHub Actions - Build & Deployed Successfully";
		}
	
	public static void main(String[] args) {
		SpringApplication.run(GithubActionsApplication.class, args);
	}

}
