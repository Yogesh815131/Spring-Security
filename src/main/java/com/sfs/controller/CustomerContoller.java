package com.sfs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfs.service.CustomerService;

@RestController
public class CustomerContoller {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/welcome")
	public String greed() {
		return "Welcome to Spring Security...";
	}

}
