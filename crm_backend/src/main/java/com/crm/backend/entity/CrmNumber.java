package com.crm.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "crm_numbers")
public class CrmNumber {
	
	@Id
	private String phoneNumber;
	private boolean active = false;
	
}
