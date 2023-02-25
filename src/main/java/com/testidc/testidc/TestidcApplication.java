package com.testidc.testidc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class TestidcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestidcApplication.class, args);
	}
	
	@RequestMapping("/message")
	public String message() {

	return "App is running";
}

}
