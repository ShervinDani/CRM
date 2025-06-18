package com.crm.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.crm.backend.entity.Customer;
import com.crm.backend.entity.CustomerPlan;
import com.crm.backend.entity.Plan;
import com.crm.backend.repository.CustomerPlanRepository;
import com.crm.backend.repository.CustomerRepository;
import com.crm.backend.repository.PlanRepository;

@Service
public class CustomerService {

	@Autowired
    private JavaMailSender mailSender;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerPlanRepository customerPlanRepository;
	@Autowired
	private PlanRepository planRepository;
	
	
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

	public List<Plan> getAllPlan() {
		return planRepository.findAll();
	}
}
