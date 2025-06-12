package com.crm.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.crm.backend.entity.Customer;

public interface CustomerRepository extends JpaSpecificationExecutor<Customer>, JpaRepository<Customer, Long> {

}
