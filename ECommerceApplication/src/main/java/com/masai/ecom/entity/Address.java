package com.masai.ecom.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String house_no;
	
	@Pattern(regexp="^[A-Za-z]+$", message =  "Please enter the correct street Name")
	private String street;
	private String city;
	private String state;
	
	@Pattern(regexp="^[0-9]+$", message = "Enter Pin Code")
	private String pincode;

}
