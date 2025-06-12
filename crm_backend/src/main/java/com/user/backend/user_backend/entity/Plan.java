package com.user.backend.user_backend.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "crm_plan")
@Data
public class Plan {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planId;
    private String name;
    private String description;
    private double price;
    private int dataLimit;
    private int voiceLimit;
    private int smsLimit;
    private int expiryDate;
    private String type;

}
