package com.crm.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crm.backend.entity.Customer;
import com.crm.backend.entity.CustomerPlan;
import com.crm.backend.entity.Plan;
import com.crm.backend.service.CustomerService;

@RestController
@RequestMapping("user/api")
@CrossOrigin("http://localhost:4000")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("getcustomer")
	public ResponseEntity<Customer> getCustomer(@RequestParam("customerId") long customerId) {
		return ResponseEntity.ok(customerService.getCustomer(customerId));
	}

	@PostMapping("savecustomer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
		return ResponseEntity.ok(customerService.saveCustomer(customer));
	}
	
	@GetMapping("getcustomercurrentplan")
	public ResponseEntity<CustomerPlan> getCustomerCurrentPlan(@RequestParam("customerId") long customerId)
	{
		return ResponseEntity.ok(customerService.getCustomerCurrentPlan(customerId));
	}
	
	@PostMapping("addcustomercurrentplan")
	public ResponseEntity<CustomerPlan> addCustomerCurrentPlan(@RequestBody CustomerPlan customerPlan)
	{
		return ResponseEntity.ok(customerService.getCustomerCurrentPlan(customerPlan));
	}
	
	@GetMapping("getallplans")
	public ResponseEntity<List<Plan>> getAllPlans()
	{
		customerService.sendMessage();
		return ResponseEntity.ok(customerService.getAllPlan());
	}
	
}
