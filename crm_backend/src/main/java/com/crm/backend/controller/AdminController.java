package com.crm.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.backend.entity.Plan;
import com.crm.backend.service.AdminService;

@RestController
@RequestMapping("admin/api")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("addplan")
	public ResponseEntity<Plan> addPlan(@RequestBody Plan plan)
	{
		return ResponseEntity.ok(adminService.addPlan(plan));
	}
	
}
