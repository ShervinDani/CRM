package com.crm.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.backend.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long>{

}
