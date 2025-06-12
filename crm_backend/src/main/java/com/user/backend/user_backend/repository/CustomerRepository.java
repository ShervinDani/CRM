package com.user.backend.user_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.user.backend.user_backend.entity.Customer;

public interface CustomerRepository extends JpaSpecificationExecutor<Customer>, JpaRepository<Customer, Long> {

}
