package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {


	@GetMapping("/hello")
	public String display() {

		return "hello world";

	}

}
