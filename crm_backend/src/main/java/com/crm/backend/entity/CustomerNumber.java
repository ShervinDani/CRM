package com.crm.backend.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "crm_user_number")
@Data
public class CustomerNumber {
	
	@Id
	private String phoneNumber;
	private String status;
	private String type;
	@ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
}
