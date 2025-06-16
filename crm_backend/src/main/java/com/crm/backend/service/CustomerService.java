package com.crm.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.backend.entity.Customer;
import com.crm.backend.entity.CustomerPlan;
import com.crm.backend.repository.CustomerPlanRepository;
import com.crm.backend.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerPlanRepository customerPlanRepository;

	public Customer getCustomer(long customerId) {
		return customerRepository.findById(customerId).get();
	}

	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public CustomerPlan getCustomerCurrentPlan(long customerId) {
		return customerPlanRepository.findTopByCustomerOrderByStartedDate(customerRepository.findById(customerId).get());
	}

	public CustomerPlan getCustomerCurrentPlan(CustomerPlan customerPlan) {
		// TODO Auto-generated method stub
		return customerPlanRepository.save(customerPlan);
	}
}
