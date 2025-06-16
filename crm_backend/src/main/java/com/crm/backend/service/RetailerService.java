package com.crm.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.backend.entity.CrmNumber;
import com.crm.backend.repository.CrmNumberRepository;

@Service
public class RetailerService {
	
	@Autowired
	private CrmNumberRepository crmNumberRepository;
	
	public List<CrmNumber> getAvailableNumber() {
		return crmNumberRepository.findAllByActive(false);
	}

}
