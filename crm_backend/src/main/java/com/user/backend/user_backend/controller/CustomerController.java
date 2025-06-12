package com.user.backend.user_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.user.backend.user_backend.entity.Customer;

@RestController
@RequestMapping("user/api")
public class CustomerController {

	
	@GetMapping("getcustomer")
	public ResponseEntity<Customer> getCustomer(@RequestParam("customerId") long customerId)
	{
		return ResponseEntity.ok(null);
	}
	
}
