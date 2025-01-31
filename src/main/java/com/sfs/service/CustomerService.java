package com.sfs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sfs.repo.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo repo;
	
	

}
