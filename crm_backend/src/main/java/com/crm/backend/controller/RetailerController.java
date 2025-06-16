package com.crm.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.backend.entity.CrmNumber;
import com.crm.backend.service.RetailerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("retailer/api")
@Slf4j
public class RetailerController {
	
	@Autowired
	private RetailerService retailerService;
	
	@GetMapping("getavailablenumber")
	public ResponseEntity<List<CrmNumber>> getAvailableNumber()
	{
		log.info("Inside Get Available Number");
		return ResponseEntity.ok(retailerService.getAvailableNumber());
	}
}
