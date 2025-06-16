package com.crm.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.backend.entity.CrmNumber;

@Repository
public interface CrmNumberRepository extends JpaRepository<CrmNumber, String>{
	
	List<CrmNumber> findAllByActive(boolean status);
	
}
