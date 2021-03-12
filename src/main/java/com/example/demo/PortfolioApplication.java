package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}

//	public static void main(String[] args) {
//		SpringApplication.run(PortfolioApplication.class, "--debug");
//	}

	@GetMapping("/")
	public String getMainPage() {
		return "index.html";
	}

	@GetMapping("/about")
	public String getAboutPage() {
		return "about.html";
	}

}
