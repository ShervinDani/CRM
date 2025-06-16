package com.crm.backend.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "crm_user_plan")
@Data
public class CustomerPlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cusPlanId;
	@ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customerId", nullable = false)
    private Customer customer;
	@ManyToOne
    @JoinColumn(name = "phone_number", referencedColumnName = "phoneNumber", nullable = false)
    private CustomerNumber customerNumber;
	@ManyToOne
    @JoinColumn(name = "plan_id", referencedColumnName = "planId", nullable = false)
    private Plan plan;
	@CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime startedDate;

}
