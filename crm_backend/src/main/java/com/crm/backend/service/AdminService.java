package com.crm.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.backend.entity.Plan;
import com.crm.backend.repository.PlanRepository;

@Service
public class AdminService {
	
	@Autowired
	private PlanRepository planRepository;

	public Plan addPlan(Plan plan) {
		return planRepository.save(plan);
	}

}
