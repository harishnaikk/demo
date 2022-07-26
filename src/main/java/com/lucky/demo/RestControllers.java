package com.lucky.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

	@GetMapping
	public String getName() {
		
		return "Lucky";
	}
}
