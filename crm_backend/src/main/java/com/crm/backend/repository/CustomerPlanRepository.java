package com.crm.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.backend.entity.Customer;
import com.crm.backend.entity.CustomerPlan;

@Repository
public interface CustomerPlanRepository extends JpaRepository<CustomerPlan, Long> {
	
	public CustomerPlan findTopByCustomerOrderByStartedDate(Customer customer);
	
}
