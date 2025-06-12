package com.crm.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.backend.repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
}
