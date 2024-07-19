package com.SpringbootCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCicdApplication {
	@GetMapping("/")
	public String home(){
		return "<h1 style='color:green; text-align:center;'>Hello, from Springboot CI/CD deployment!</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCicdApplication.class, args);
	}

}
