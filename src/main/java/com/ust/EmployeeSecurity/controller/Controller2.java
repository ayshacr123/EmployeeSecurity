package com.ust.EmployeeSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest1/auth1")
public class Controller2 {
	@GetMapping("/goodmorning")
	public String greeting() {
		return "Its already morning";
	}
}
