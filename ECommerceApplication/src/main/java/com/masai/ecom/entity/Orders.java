package com.masai.ecom.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


public class Orders {
	
	private Integer orderId;
	
	private LocalDateTime orderDateTime; 
	
	@ManyToOne
	@JsonIgnore
	private UserModel user;
	
	@OneToOne
	private Address oddress;
	

}
